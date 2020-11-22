package com.spring.homework.service;

import com.spring.homework.domain.Company;
import com.spring.homework.domain.Product;
import com.spring.homework.dto.ProductDTO;
import com.spring.homework.exceptions.ProductAlreadyExsistException;
import com.spring.homework.exceptions.ProductNotAlreadyExsistExseption;
import com.spring.homework.repository.CompanyRepository;
import com.spring.homework.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    private final CompanyRepository companyRepository;

    public List<Product> getAllProduct(){
        return productRepository.findByOrderByIdAsc();
    }

    public void updateProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    public Product getProduct(Long id) { return productRepository.findById(id).orElseThrow(() -> new ProductNotAlreadyExsistExseption(String.format("Cant find product with id: ",id))); }

    public Product updateProductDTO(ProductDTO productDTO){
        Product product = productRepository.findById(productDTO.getId()).orElseThrow(() -> new ProductNotAlreadyExsistExseption(String.format("Cant find product with id: ")));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        Company company = companyRepository.findById(productDTO.getCompany().getId()).orElseThrow();
        product.setCompany(company);
        return productRepository.save(product);
    }
}
