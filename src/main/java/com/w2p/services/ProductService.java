package com.w2p.services;

import com.w2p.model.dto.ProductDto;
import com.w2p.model.entity.Product;

import java.util.List;

public interface ProductService {
    void saveProduct(ProductDto dto);
    List<Product> getAllProduct();
    Product updateProduct(Integer id, ProductDto dto);
    Product getProductById(Integer id);
    void deleteById(Integer id);
}
