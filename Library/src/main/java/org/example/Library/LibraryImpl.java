package org.example.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryImpl implements Library{
    List<Book> books;

    public LibraryImpl() {this(new ArrayList<>());}
    public LibraryImpl(List<Book> books){
        this.books = books;
    }

    @Override
    public List<Book> findBookByName(String name) {
        return books.stream().
                filter(book -> book.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        return books
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBookByPublishYear(int year) {
        return books
                .stream()
                .filter(book -> book.getPublisherYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
