package com.w2p.services;

import com.w2p.model.dto.ProductDto;
import com.w2p.model.entity.Cart;
import com.w2p.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public void addToCart(ProductDto productDto){
        Cart newCart = new Cart();

        newCart.setProductId(productDto.getId());
        newCart.setProductName(productDto.getName());
        newCart.setProductPrice(productDto.getPrice());

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();

        newCart.setUserName(userName);


        cartRepository.save(newCart);

    }

    public List<Cart> viewCart() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        System.out.println("service cart");

        return cartRepository.getAllByUserName(userName);
    }

    public void removeItem(int id) {
        System.out.println("remove service test");
        cartRepository.deleteById(id);
    }

    public void deleteCart(String username) {
        cartRepository.deleteByUserName(username);
    }
}
