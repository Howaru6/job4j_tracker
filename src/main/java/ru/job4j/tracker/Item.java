package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }
    private int id;

    private String name;

    LocalDateTime created = LocalDateTime.now();

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printinfo() {
        System.out.println("Имя ползователя: " + name);
        System.out.println("ID ползователя: " + id);
    }
}