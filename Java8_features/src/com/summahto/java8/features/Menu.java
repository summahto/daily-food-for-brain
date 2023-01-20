package com.summahto.java8.features;

import java.util.List;

public class Menu {

    List<String> items;

    public Menu(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "com.summahto.java8.features.Menu{" +
                "items=" + items +
                '}';
    }
}
