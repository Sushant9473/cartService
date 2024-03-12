package com.sushant.cartservice.module;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    private LocalDate date;
    private Product[] products;
}
