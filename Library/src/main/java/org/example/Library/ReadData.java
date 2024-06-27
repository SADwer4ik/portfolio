package org.example.Library;

import java.util.List;
import java.util.Scanner;

public class ReadData {
    Scanner sc = new Scanner(System.in);
    ReadData(){};
    public void printInfo(){
        System.out.println("1 - добавить книгу");
        System.out.println("2 - удалить книгу");
        System.out.println("3 - искать книги");
        System.out.println("4 - посмотреть все книги");
        System.out.println("5 - завершить работу");
    }
    public Book readBook(){
        System.out.println("Введите название");
        String name = "",
                author = "",
                ISBN = "";
        int year = 0;
        if (sc.hasNextLine()){
            name = sc.nextLine();
        }
        System.out.println("Введите автора");
        if (sc.hasNextLine()){
            author = sc.nextLine();
        }
        System.out.println("Введите ISNB");
        if (sc.hasNextLine()){
            ISBN = sc.nextLine();
        }
        System.out.println("Введите год");
        if (sc.hasNextInt()){
            year = sc.nextInt();

        }
        return new Book(name, author, ISBN, year);

    }

    public void findBook(Library library){
        System.out.println("1 - искать книги по названию");
        System.out.println("2 - искать книги по автору");
        System.out.println("3 - искать книги по году издания");

        if (sc.hasNextInt()){
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Введите название");
                    if (sc.hasNextLine()){
                        printBooks(library.findBookByName(sc.nextLine()));
                    }
                    break;
                case 2:
                    System.out.println("Введите имя");
                    if (sc.hasNextLine()){
                        printBooks(library.findBookByAuthor(sc.nextLine()));
                    }
                    break;
                case 3:
                    System.out.println("Введите год");
                    if (sc.hasNextInt()) {
                        printBooks(library.findBookByPublishYear(sc.nextInt()));
                    }
                    break;
            }
            if (!(choose > 0 || choose < 4)){
                System.out.println("Не удалось распознать команду");
            }
        }
    }
    public void printBooks(List<Book> books){
        if (!books.isEmpty()) {
            for( Book book :books){
                System.out.printf(book.toString());
            }
        }
        else{
            System.out.println("Ничего не удалось найти");
        }
        printInfo();
    }
}
