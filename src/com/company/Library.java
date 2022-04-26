package com.company;

public class Library {
    private Book[] books;

    public Library(int amount) {
        this.books = new Book[amount];
    }

    public static void addBook (Book[] books, Book book, int target){
        books[target] = book;
    }
}
