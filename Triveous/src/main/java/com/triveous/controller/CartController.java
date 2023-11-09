package com.triveous.controller;

import com.triveous.model.CartItem;
import com.triveous.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/{productId}")
    public void addToCart(@PathVariable Long productId, @RequestParam int quantity) {
        cartService.addToCart(productId, quantity);
    }

    @GetMapping
    public List<CartItem> viewCart() {
        return cartService.viewCart();
    }

    @PutMapping("/{productId}")
    public void updateCartItemQuantity(@PathVariable Long productId, @RequestParam int quantity) {
        cartService.updateCartItemQuantity(productId, quantity);
    }

    @DeleteMapping("/{productId}")
    public void removeFromCart(@PathVariable Long productId) {
        cartService.removeFromCart(productId);
    }
}
