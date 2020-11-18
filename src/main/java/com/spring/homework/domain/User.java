package com.spring.homework.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "user_table")
public class User {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_firstname")
    private String firstname;

    @Column(name = "user_lastname")
    private String lastname;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name="role_id")
    private Role role;

}
