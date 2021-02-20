package com.w2p.controller;
import com.w2p.model.dto.ProductDto;
import com.w2p.model.entity.Product;
import com.w2p.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/saveProduct")
    public void saveProduct(@RequestBody ProductDto dto){
        productService.saveProduct(dto);
    }

    @GetMapping(value = "/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }

    @GetMapping(value = "/getProduct/{id}")
    public Product getProductById(@PathVariable("id") Integer id){
        return productService.getProductById(id);
    }

    @PutMapping(value = "/updateProduct/{id}")
    public Product updateProduct(@PathVariable("id") Integer id, @RequestBody ProductDto dto){
        return productService.updateProduct(id, dto);
    }

    @PostMapping(value = "/deleteById")
    public void deleteById(@RequestBody ProductDto productDto) {
        productService.deleteById(productDto.getId());
    }



}
