package com.sushant.cartservice.services;

import com.sushant.cartservice.dtos.FakeStoreAddCart;
import com.sushant.cartservice.dtos.FakeStoreCart;
import com.sushant.cartservice.module.Cart;

import java.time.LocalDate;
import java.util.List;

public interface CartService {
    Cart getSingleCart(Long id);
    List<Cart> getAllCarts();

    List<Cart> getInDateRange(LocalDate startDate, LocalDate endDate);

    List<Cart> getUserCart(Long id);

    Cart createCart(FakeStoreAddCart cart);

    Cart updateCart(Long id, FakeStoreAddCart cart);

    Cart deleteCart(Long id);
}
