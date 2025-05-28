package com.keyin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Book book1;

    @BeforeEach
    public void setUp(){
        library = new Library();
        book1 = new Book("The Hunger Games");
        library.addBook(book1);

    }

    @Test
    public void testFindBookByTitle(){
        Book found = library.findBookByTitle("The Hunger Games");
        assertNotNull(found);
        assertEquals("The Hunger Games", found.getTitle());
    }

    @Test
    public void testFindBookByTitleNotFound(){
        Book notFound = library.findBookByTitle("Unknown Book");
        assertNull(notFound);
    }

    @Test
    public void testIsBookAvailable(){
        assertTrue(library.isBookAvailable("The Hunger Games"));
        book1.borrow();
        assertFalse(library.isBookAvailable("The Hunger Games"));
    }

}
