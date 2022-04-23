package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Филип", "Дик");
        Author author2 = new Author("Андрей", "Платонов");
	    Book book1 = new Book("Убик", author1,1969 );
        Book book2 = new Book("Котлован", author2, 1930);
        System.out.println("Название книги: " + book1.getName());
        System.out.println("Фамилия автора: " + book1.getAuthor().getAuthorSurname());
        System.out.println("Год публикации: " + book1.getPublisherYear());
        book1.setPublisherYear(1968);
        System.out.println("Год публикации: " + book1.getPublisherYear());


    }
}
