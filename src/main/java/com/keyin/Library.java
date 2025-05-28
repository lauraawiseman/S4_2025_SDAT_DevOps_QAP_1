package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> catalog = new ArrayList<>();

    public void addBook(Book book){
        catalog.add(book);
    }

    public List<Book> getCatalog(){
        return catalog;
    }

    public Book findBookByTitle(String title){
        for (Book book : catalog){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public boolean isBookAvailable(String title){
       for (Book book : catalog){
           if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()){
               return true;
           }
       }
       return false;
    }

}


