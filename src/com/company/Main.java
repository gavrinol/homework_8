package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Филип", "Дик");
        Author author2 = new Author("Роберт", "Хайнлайн");
	    Book book1 = new Book("Убик", author1,1969 );
        Book book2 = new Book("Чужак в чужой стране", author2, 1961);


        Book[] sfiction = new Book[5];
        Library.addBook(sfiction, book1, 0);
        Library.addBook(sfiction, book2, 1);



        for (int i = 0; i < sfiction.length; i++) {
            System.out.println(sfiction[i].getAuthor().getAuthorName() + " " + sfiction[i].getAuthor().getAuthorSurname() + ": " + sfiction[i].getName() + ": " + sfiction[i].getPublisherYear());
            }
        }

}
