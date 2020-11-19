package com.spring.homework.controller;

import com.spring.homework.domain.Company;
import com.spring.homework.domain.Product;
import com.spring.homework.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/getAll")
    public List<Company> getAll(){
        return companyService.getAllCompany();
    }

    @PostMapping("/updateAndInsert")
    public void updateCompany(@RequestBody Company company){
        companyService.updateCompany(company);
    }

    @PostMapping("/delete")
    public void deleteCompany(@RequestBody Company company){
        companyService.deleteCompany(company);
    }

    @RequestMapping(value = {"/show_company"})
    public String showCompany(Model model) {
        model.addAttribute("companies", companyService.getAllCompany());
        return "show_company";
    }
}
