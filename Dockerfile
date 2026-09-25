# Estágio 1: Build da aplicação (Maven 3.9 + Java 21)
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# Cache das dependências do Maven
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Compila o projeto gerando o .jar
COPY src ./src
RUN mvn clean package -DskipTests

# Estágio 2: Execução leve apenas com JRE 21
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copia o arquivo .jar gerado no primeiro estágio
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]