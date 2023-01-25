package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
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

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void printinfo() {
        System.out.println("Имя ползователя: " + name);
        System.out.println("ID ползователя: " + id);
    }

    public static void main(String[] args) {
        Item first = new Item("Олег",12802341);
        first.printinfo();
    }

}