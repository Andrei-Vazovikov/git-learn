package com.andersen.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
}
