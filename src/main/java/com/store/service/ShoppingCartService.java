package com.store.service;

import com.store.exception.OutOfStockException;
import com.store.model.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws OutOfStockException;

    BigDecimal getTotal();
}
