package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookIsAvailableIntially(){
        Book book = new Book("Clean Code");
        assertTrue(book.isAvailable());
    }

    @Test
    public void testBorrowSetsAvaiabilityToFalse(){
        Book book = new Book("Clean Code");
        book.borrow();
        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBookSetsAvailabilityToTrue(){
        Book book = new Book("Clean Code");
        book.borrow(); // Make unavailable first
        book.returnBook(); // Then return
        assertTrue(book.isAvailable());
    }
}
