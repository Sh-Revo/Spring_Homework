package com.spring.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/home")
    public String homeForm(){
        return "/main_form";
    }

    @GetMapping("/api/company")
    public String companyForm(){
        return "/api/company";
    }

    @GetMapping("/api/product")
    public String productForm(){
        return "/api/product";
    }

    @GetMapping("/api/user")
    public String userForm(){
        return "/api/user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "/admin";
    }

    @GetMapping("/user")
    public String user(){
        return "/user";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "/login";
    }

    @GetMapping("/login_error")
    public String loginErrorForm(){
        return "/login_error";
    }

    @GetMapping("/403")
    public String error(){
        return "/403";
    }
}
