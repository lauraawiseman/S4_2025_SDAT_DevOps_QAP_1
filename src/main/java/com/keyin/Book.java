package com.keyin;

public class Book {
    private final String title;
    private boolean available = true;

    public Book(String title) {
        this.title = title;
    }

    public boolean isAvailable(){
        return available;
    }

    public void borrow(){
        if (available){
            available = false;
        }
    }

    public void returnBook(){
        available = true;
    }

    public String getTitle(){
        return title;
    }
}