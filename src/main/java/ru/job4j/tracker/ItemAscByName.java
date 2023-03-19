package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscByName implements Comparator<Item> {

    @Override
    public int compare(Item up, Item down) {
        return up.getName().compareTo(down.getName());
    }
}