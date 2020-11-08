package com.spring.homework.service;


import com.spring.homework.domain.Company;
import com.spring.homework.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public List<Company> getAllCompany(){
        return companyRepository.findAll();
    }
}
