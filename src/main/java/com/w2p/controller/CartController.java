package com.w2p.controller;

import com.w2p.model.dto.CartDto;
import com.w2p.model.dto.ProductDto;
import com.w2p.model.entity.Cart;
import com.w2p.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/addToCart")
    public void addToCart(@RequestBody ProductDto productDto){
        System.out.println(productDto.getName());
        cartService.addToCart(productDto);
    }

    @GetMapping("/viewCart")
    public List<Cart> viewCart(){
//        System.out.println("controller cart");
        return cartService.viewCart();
    }

    @PostMapping("/removeItem")
    public void removeItem(@RequestBody CartDto cartDto){
//        System.out.println("remove test");
        cartService.removeItem(cartDto.getId());
    }

    @PostMapping("/deleteCart/{username}")
    public void deleteCart(@PathVariable("username") String username) {
        cartService.deleteCart(username);
    }
}
