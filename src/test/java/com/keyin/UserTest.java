package com.keyin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;


    @BeforeEach
    public void setUp(){
        user = new User("Laura");
        book1 = new Book("The Hunger Games");
        book2 = new Book("The Fault in Our Stars");
        book3 = new Book("The Perks of Being a Wallflower");
        book4 = new Book("Funny Story");
    }

    @Test
    public void testBorrowWithinLimit(){
        assertTrue(user.borrow(book1));
        assertTrue(user.borrow(book2));
        assertTrue(user.borrow(book3));
    }

    @Test
    public void testBorrowOverLimit(){
        user.borrow(book1);
        user.borrow(book2);
        user.borrow(book3);
        assertFalse(user.borrow(book4), "You cannot borrow more than 3 books at a time.");
    }

    @Test
    public void testReturnBook(){
        user.borrow(book1);
        user.returnBook(book1);
        assertFalse(user.getBorrowedBooks().contains(book1));
        assertTrue(book1.isAvailable());
    }
}
