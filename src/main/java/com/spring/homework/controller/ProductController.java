package com.spring.homework.controller;

import com.spring.homework.domain.Company;
import com.spring.homework.domain.Product;
import com.spring.homework.service.CompanyService;
import com.spring.homework.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final CompanyService companyService;

    @GetMapping("/getAll")
    public String getAllProduct(Model model){
        model.addAttribute("allCompany", productService.getAllProduct());
        return "add_product";
    }

    @PostMapping("/updateAndInsert")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @PostMapping("/delete")
    public void deleteProduct(@RequestBody Product product){
        productService.deleteProduct(product);
    }

//    @ModelAttribute("allCompany")
//    public List<Company> allCompany() {
//        List<Company> companyList= companyService.getAllCompany();
//        return companyList;
//    }

}
