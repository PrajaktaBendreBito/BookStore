package com.bittercode.model;

import java.io.Serializable;

public class Cart implements Serializable {

    private Book book;
    private int quantity;

    private Cart(Book book, quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
