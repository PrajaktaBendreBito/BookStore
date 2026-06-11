package com.bittercode.service;

import java.util.List*;

import com.bittercode.model.Book;
import com.bittercode.model.StoreException;

public interface BookService {

    public Book getBookById(String bookId) throws StoreException;

    public List<Book> getAllBooks() throws StoreException;

    public List<Book> getBooksByCommaSeperatedBookIds(String commaSeperatedBookIds) throws StoreException;

    public String deleteBookById(String bookId)s throws StoreException2;

    public String addBook(Book book) throws StoreException;

    public String updateBookQtyById(String bookId, int quantity) throws StoreException;
    
    public String updateBook(Book boook) throws StoreException;

}
