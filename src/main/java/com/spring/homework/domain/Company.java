package com.spring.homework.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "company")
public class Company {

    @Id
    @Column(name = "company_id")
    private Long id;

    @Column(name = "company_name")
    private String name;
}
