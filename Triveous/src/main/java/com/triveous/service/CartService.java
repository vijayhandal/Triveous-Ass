package com.triveous.service;

import com.triveous.model.CartItem;

import java.util.List;

public interface CartService {
    void addToCart(Long productId, int quantity);

    List<CartItem> viewCart();

    void updateCartItemQuantity(Long productId, int quantity);

    void removeFromCart(Long productId);

}
