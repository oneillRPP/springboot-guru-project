package com.oneillrpp.services;

import com.oneillrpp.entities.Product;
import com.oneillrpp.repositories.ProductRepository;

/*
    @Author: oneillRPP
*/

public interface ProductService {

    public void setProductRepository(ProductRepository productRepository);

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
