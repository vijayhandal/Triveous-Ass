package com.triveous.service.impl;

import com.triveous.model.CartItem;
import com.triveous.repository.CartItemRepository;
import com.triveous.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public void addToCart(Long productId, int quantity) {
    	CartItem existingItem = cartItemRepository.findById(productId).orElse(null);

        if (existingItem == null) {
            CartItem newItem = new CartItem();
            newItem.setId(productId);
            newItem.setQuantity(quantity);
            cartItemRepository.save(newItem);
        } else {
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
            cartItemRepository.save(existingItem);
        }
    }

    @Override
    public List<CartItem> viewCart() {
        return cartItemRepository.findAll();
    }

    @Override
    public void updateCartItemQuantity(Long productId, int quantity) {
    	CartItem existingItem = cartItemRepository.findById(productId).orElse(null);

        if (existingItem != null) {
            existingItem.setQuantity(quantity);
            cartItemRepository.save(existingItem);
        }
    }

    @Override
    public void removeFromCart(Long productId) {
    	 cartItemRepository.deleteById(productId);
    }

}
