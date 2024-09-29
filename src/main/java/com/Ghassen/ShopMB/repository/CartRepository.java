package com.Ghassen.ShopMB.repository;

import com.Ghassen.ShopMB.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
