package org.example.Library;

import javax.management.BadAttributeValueExpException;
import java.util.Scanner;

public class Main {
    static Library library = new LibraryImpl();
    Scanner sc = new Scanner(System.in);
    Main(){}
    public static void main(String[] args) throws BadAttributeValueExpException {
        Scanner sc = new Scanner(System.in);
        ReadData readData = new ReadData();
        int choose;
        readData.printInfo();
        boolean flag = true;
        while(flag) {
            if (sc.hasNextInt()) {
                choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        library.addBook(readData.readBook());
                        break;
                    case 2:
                        library.deleteBook(readData.readBook());
                        break;
                    case 3:
                        readData.findBook(library);
                        break;
                    case 4:
                        readData.printBooks(library.getAllBooks());
                        break;
                    case 5:
                        flag = false;
                        break;
                }
                if (!(choose < 6 || choose > 0)){
                    System.out.println("Неизвестная команда");
                }
            }
            else{
                System.out.println("Введите правильное значение");
            }
        }


    }
}
