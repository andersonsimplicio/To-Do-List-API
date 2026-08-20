# 📝 To-Do List API

Uma API REST para gerenciamento de tarefas (To-Do List) desenvolvida com Spring Boot.

---

## 🚀 Pré-requisitos e Instalação

Antes de começar, você precisará ter as seguintes ferramentas instaladas na sua máquina:

* **Java Development Kit (JDK):** Versão 21 ou superior (visto que o projeto utiliza recursos recentes).
* **Maven:** Para gerenciamento de dependências (opcional se usar o `mvnw` incluso).
* **IDE / Editor:** Visual Studio Code ou IntelliJ IDEA.

---

## 🛠️ Configurando o VS Code (Recomendado)

Para que o ambiente Java, Spring Boot e Lombok funcione perfeitamente no VS Code sem erros de compilação, instale as seguintes extensões:

* **Extension Pack for Java** (*Microsoft*) — Instala o suporte essencial ao Java e Maven.
* **Spring Boot Extension Pack** (*VMware*) — Ajuda na criação e navegação de projetos Spring.
* **Lombok Annotations Support for VS Code** (*GabrielBB*) — Obrigatória para que o VS Code entenda o `@Data` e evite erros de compilação nas classes.

---

## ⚙️ Configurações Automáticas (`settings.json`)

Para ativar o autocomplete inteligente e fazer o VS Code importar as classes (como `@Entity`, `LocalDateTime`) e organizar o código sozinho ao salvar, adicione as seguintes chaves ao seu `settings.json`:

```json
{
    "java.configuration.updateBuildConfiguration": "automatic",
    "editor.suggestOnTriggerCharacters": true,
    "java.completion.enabled": true,
    "editor.codeActionsOnSave": {
        "source.organizeImports": "explicit"
    }
}