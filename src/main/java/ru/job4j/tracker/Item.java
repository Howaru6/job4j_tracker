package ru.job4j.tracker;
public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printinfo() {
        System.out.println("Имя ползователя: " + name);
        System.out.println("ID ползователя: " + id);
    }

    public static void main(String[] args) {
        Item first = new Item("Олег", 12802341);
        first.printinfo();
        Item second = new Item("Александр");
        second.printinfo();
        Item third = new Item();
        third.printinfo();
    }
}