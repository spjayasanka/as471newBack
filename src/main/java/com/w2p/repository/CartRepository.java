package com.w2p.repository;

import com.w2p.model.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> getAllByUserName(String userName);
}
