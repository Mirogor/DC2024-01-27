package com.example.lab2.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "login")
    @Size(min = 2, max = 64)
    String login;
    @Column(name = "password")
    @Size(min = 8, max = 128)
    String password;
    @Column(name = "firstname")
    @Size(min = 2, max = 64)
    String firstname;
    @Column(name = "lastname")
    @Size(min = 2, max = 64)
    String lastname;

}
