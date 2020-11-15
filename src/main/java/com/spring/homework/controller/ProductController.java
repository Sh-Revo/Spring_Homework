package com.spring.homework.controller;

import com.spring.homework.domain.Product;
import com.spring.homework.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PostMapping("/updateAndInsert")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @PostMapping("/delete")
    public void deleteProduct(@RequestBody Product product){
        productService.deleteProduct(product);
    }
}
