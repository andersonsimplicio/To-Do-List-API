package com.andersonsimplicio.todolist.user;

import lombok.Data;

/*/
Usuando Lombok para gerar os getter e setter
*/
@Data 
public class UserModel {
    private String userName;
    private String name;
    private String password;
}
