package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Филип", "Дик");
        Author author2 = new Author("Андрей", "Платонов");
	    Book book1 = new Book("Убик", author1,1969 );
        Book book2 = new Book("Котлован", author2, 1930);


        Book[] books = new Book[5];
        addBook(book1, books, 0);
        addBook(book2, books, 1);
        for (Book book : books) {
            System.out.println(book.getAuthor().getAuthorName() + " " + book.getAuthor().getAuthorSurname() + ": " + book.getName() + ": " + book.getPublisherYear());
        }

    }
    public static void addBook (Book book, Book[] books, int target){
        books[target] = book;
    }

}
