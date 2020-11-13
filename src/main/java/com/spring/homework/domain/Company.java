package com.spring.homework.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "company")
public class Company {

    @Id
    @Column(name = "company_id")
    private Long id;

    @Column(name = "company_name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Product> products;
}
