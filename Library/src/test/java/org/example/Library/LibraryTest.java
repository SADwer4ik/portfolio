package org.example.Library;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LibraryTest {
    Library library = new LibraryImpl();

    /**
     * Проверяем, что при инициализации библиотека пуска
     * Действия: создать библиотеку
     * Ожидаемый результат: список книг пуст
     */
    @Test
    public void emptyLibrary(){
        assertTrue(library.getAllBooks().isEmpty());
    }
    /**
     * Проверяем добавление в библиотеку
     * Действия: добавить книгу в библиотеку
     * Ожидаемый результат: список книг не пуст
     */
    @Test
    public void addBook(){
        library.addBook(new Book("Hello", "Hello", "Hello", 2004));
        assertFalse(library.getAllBooks().isEmpty());
    }

    /**
     * Проверка поиска книг
     * Действие: добавить книгу в библиотеку,
     * найти книгу
     * Ожидаемый результат книга будет найдена
     */
    @Test
    public void findBook(){
        library.addBook(new Book("Hello", "Author", "ISBN", 2004));
        assertFalse(library.findBookByAuthor("Author").isEmpty());
        assertFalse(library.findBookByPublishYear(2004).isEmpty());
        assertFalse(library.findBookByName("Hello").isEmpty());
    }
    /**
     * Проверка удаления книги
     * Действия: добавить книгу, удалить книгу
     * Ожидаемый результат: список книг будет пуст
     */
    @Test
    public void deleteBook(){
        Book book = new Book("Hello", "Author", "ISBN", 2004);
        library.addBook(book);
        library.deleteBook(book);
        assertTrue(library.getAllBooks().isEmpty());
    }
}
