package com.summahto.java8.features;

import java.util.List;

public class Orders {

    private List<Menu> menuList;

    public Orders(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "com.summahto.java8.features.Orders{" +
                "menuList=" + menuList +
                '}';
    }
}
