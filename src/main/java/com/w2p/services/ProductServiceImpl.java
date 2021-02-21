package com.w2p.services;

import com.w2p.model.dto.ProductDto;
import com.w2p.model.entity.Product;
import com.w2p.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @Override
    public void saveProduct(ProductDto dto) {
        Product product = new Product();

        product.setName(dto.getName());
        product.setBrandName(dto.getBrandName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setInStock(dto.getInStock());

        productRepository.save(product);

    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }



    @Override
    public Product updateProduct(Integer id, ProductDto dto) {
       Product product = productRepository.findProductById(id);

       if(dto.getName() != null) {
           product.setName(dto.getName());
       }
       if(dto.getBrandName() != null) {
           product.setBrandName(dto.getBrandName());
       }
       if (dto.getPrice() != null) {
           product.setPrice(dto.getPrice());
       }

       if (dto.getDescription() != null) {
           product.setDescription(dto.getDescription());
       }
       if (dto.getInStock() != null) {
           product.setInStock(dto.getInStock());
       }

       productRepository.save(product);

        return product;
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findProductById(id);
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

}
