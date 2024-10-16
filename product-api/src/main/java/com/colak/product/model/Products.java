package com.colak.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public class Products {

    private int id;

    private String name;

    private BigDecimal price;
}
