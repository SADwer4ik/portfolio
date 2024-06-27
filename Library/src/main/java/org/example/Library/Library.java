package org.example.Library;

import java.util.List;

public interface Library {
    public List<Book> findBookByName(String name);
    public void addBook(Book book);
    public void deleteBook(Book book);
    public List<Book> findBookByAuthor(String author);
    public List<Book> findBookByPublishYear(int year);
    public List<Book> getAllBooks();
}
