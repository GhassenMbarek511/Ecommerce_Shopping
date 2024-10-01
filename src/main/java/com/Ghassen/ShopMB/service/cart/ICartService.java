package com.Ghassen.ShopMB.service.cart;



import com.Ghassen.ShopMB.dto.CartDto;
import com.Ghassen.ShopMB.model.Cart;
import com.Ghassen.ShopMB.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
    CartDto convertToDto(Cart cart);
}