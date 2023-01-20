package com.summahto.java8.features;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrdersDriver {

    public static void main(String[] args) {

        List<String> order1StarterItems = new ArrayList<>();
        order1StarterItems.add("Paneer tikka");
        order1StarterItems.add("Afghani Chicken");

        List<String> order2StarterItems = new ArrayList<>();
        order2StarterItems.add("Masala Papad");
        order2StarterItems.add("Tandoori Chicken");

        List<String> order1MainCourseItems = new ArrayList<>();
        order1MainCourseItems.add("Dal Makhani");
        order1MainCourseItems.add("Butter Naan");
        
        List<String> order2MainCourseItems = new ArrayList<>();
        order2MainCourseItems.add("Tandoori Roti");
        order2MainCourseItems.add("Butter chicken");

        List<String> order1DessertItems = new ArrayList<>();
        order1DessertItems.add("Ice Cream");
        order1DessertItems.add("chaas");
        
        List<String> order2DessertItems = new ArrayList<>();
        order2DessertItems.add("Lassi");
        order2DessertItems.add("Lime juice");

        Menu order1Starters = new Menu(order1StarterItems);
        Menu order1mainCourse = new Menu(order1MainCourseItems);
        Menu order1dessert = new Menu(order1DessertItems);


        Menu order2Starters = new Menu(order2StarterItems);
        Menu order2mainCourse = new Menu(order2MainCourseItems);
        Menu order2dessert = new Menu(order2DessertItems);

        List<Menu> order1menuList = new ArrayList<>();
        order1menuList.add(order1Starters);
        order1menuList.add(order1mainCourse);
        order1menuList.add(order1dessert);

        List<Menu> order2menuList = new ArrayList<>();
        order2menuList.add(order2Starters);
        order2menuList.add(order2mainCourse);
        order2menuList.add(order2dessert);

        Orders order1 = new Orders(order1menuList);
        Orders order2 = new Orders(order2menuList);

        List<Orders> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        Customer customerOrders = new Customer(orderList);

        customerOrders.getOrdersList().stream().
                forEach(order -> order.getMenuList().stream().
                        forEach(menu -> menu.getItems().stream().
                                forEach(item -> System.out.println(item))));




    }
}
