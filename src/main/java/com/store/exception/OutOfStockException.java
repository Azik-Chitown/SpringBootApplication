package com.store.exception;

import com.store.model.Product;

@SuppressWarnings("serial")
public class OutOfStockException extends Exception {

    private static final String DEFAULT_MESSAGE = "The product is out of stock";

    public OutOfStockException() {
        super(DEFAULT_MESSAGE);
    }

    public OutOfStockException(Product product) {
        super(String.format("Not enough %s products in stock. Only %d left", product.getName(), product.getQuantity()));
    }

}
