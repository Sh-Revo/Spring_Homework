package com.spring.homework.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "role_table")
public class Role {

    @Id
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    private String name;
}
