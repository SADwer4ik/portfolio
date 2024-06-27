package org.example.Library;

public class Book {
    private String name;
    private String author;
    private String ISBN;
    private int publisherYear;
    public Book(String name, String author, String ISBN, int year){
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.publisherYear = year;
    }
    public Book(){this("", "", "", 0);}
    public String getName() {
        return name;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString(){
        return "Name: " + name + "%n"
                + "Author: " + author + "%n"
                + "ISBN: " + ISBN + "%n"
                + "Year of publishing: " + publisherYear + "%n";
    }
}
