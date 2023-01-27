package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book java = new Book("Java", 201);
        Book c = new Book("C++", 97);
        Book python = new Book("Python", 2);
        Book cleanCode = new Book("Clean code", 15);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = c;
        books[2] = python;
        books[3] = cleanCode;
        for (Book i : books) {
            System.out.println(i.getName() + " " + i.getPages());
        }
        books[0] = cleanCode;
        books[3] = java;
        for (Book i : books) {
            System.out.println(i.getName() + " " + i.getPages());
        }
        for (Book i : books) {
            if (i.getName().equals("Clean code")) {
                System.out.println(i.getName() + " " + i.getPages());
            }
        }
    }
}
