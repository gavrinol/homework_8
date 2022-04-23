package com.company;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getAuthorName(){
        return name;
    }
    public  String getAuthorSurname(){
        return surname;
    }
}
