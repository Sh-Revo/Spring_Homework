package com.spring.homework.dto;

import com.spring.homework.domain.Company;
import com.spring.homework.domain.Product;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class ProductDTO extends Product {

    private Long id;

    private String name;

    private BigDecimal price;

    private Long companyId;
}
