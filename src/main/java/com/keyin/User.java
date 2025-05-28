package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private final List<Book> borrowedBooks = new ArrayList<>();
    private static final int MAX_BORROW_LIMIT = 3;

    public User(String name){
        this.name = name;
    }

    public boolean borrow(Book book){
        if (borrowedBooks.size() < MAX_BORROW_LIMIT && book.isAvailable()){
            book.borrow();
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public void returnBook(Book book){
        if (borrowedBooks.remove(book)){
            book.returnBook();
        }
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public String getName(){
        return name;
    }
}
