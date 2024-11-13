package com.roberto.projeto_spring_rest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Integer id;
    @Column(name = "name_users")
    private String name;
    @Column(name = "email_users")
    private String email;
    @Column(name = "password_users")
    private String password;
}
