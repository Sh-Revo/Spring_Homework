package com.spring.homework.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String index2() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    @GetMapping("/company")
    public String company(){
        return "company";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/add_company")
    public String addCompany(){
        return "add_company";
    }

    @GetMapping("/add_product")
    public String addProduct(){
        return "add_product";
    }

    @GetMapping("/show_company")
    public String showCompany(){
        return "show_company";
    }
}
