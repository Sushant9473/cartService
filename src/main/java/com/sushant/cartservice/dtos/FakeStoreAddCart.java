package com.sushant.cartservice.dtos;

import com.sushant.cartservice.module.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FakeStoreAddCart {
    private Long userId;
    private LocalDate date;
    private Product[] products;
}
