package com.spring.homework.controller;

import com.spring.homework.domain.Company;
import com.spring.homework.domain.Product;
import com.spring.homework.service.CompanyService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @RequestMapping(value = {"/show_company"})
    public String showCompany(Model model) {
        model.addAttribute("companies", companyService.getAllCompany());
        return "show_company";
    }

    @RequestMapping("/add_company")
    public String newCompanyForm(Model model) {
        Company company = new Company();
        model.addAttribute("company", company);
        return "add_company";
    }

    @RequestMapping("/edit_company")
    public String editCompanyForm(@RequestParam long id, Model model) {
        Company company = companyService.getCompany(id);
        model.addAttribute("company", company);
        return "edit_company";
    }

    @RequestMapping("/delete_company")
    public String deleteCustomerForm(@RequestParam long id) {
        companyService.deleteCompany(id);
        return "redirect:/api/company/show_company";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCompany(@ModelAttribute("company") Company company) {
        companyService.updateCompany(company);
        return "redirect:/api/company/show_company";
    }

}
