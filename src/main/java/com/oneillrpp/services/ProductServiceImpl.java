package com.oneillrpp.services;

import com.oneillrpp.entities.Product;
import com.oneillrpp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
    @Author: oneillrpp
*/

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

}
