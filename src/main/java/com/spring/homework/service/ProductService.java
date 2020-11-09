package com.spring.homework.service;

import com.spring.homework.domain.Product;
import com.spring.homework.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void updateProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(Product product){
        productRepository.delete(product);
    }
}
