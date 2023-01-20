package com.summahto.multipledatasources.jsonparsing;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String args[]) throws IOException {

        File file = new File("src/main/java/com/summahto/multipledatasources/jsonparsing/trades.json");
        URL url = file.toURI().toURL();
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        mapper.registerModule(new JavaTimeModule());


        Response response = mapper.readValue(file, Response.class);
        System.out.println(response.toString());

        List<LocalDate> dateList = new ArrayList<>();
        LocalDate d = LocalDate.parse("2019-01-25");
        for (int i=0 ; i< 20 ; i++){
            dateList.add(d.plusDays(i));

        }
        dateList.forEach(date-> System.out.println(date.toString()));

        LocalDate d1 = LocalDate.parse("2019-02-01");
        LocalDate d2 = LocalDate.parse("2019-02-04");

        System.out.println("filered Dates");


        dateList.stream()
                .filter(iDate -> iDate.compareTo(d1) >=0 && iDate.compareTo(d2) <= 0)
                .forEach(System.out::println);

        String listName = "NSCC.file";

        listName = listName.substring(listName.lastIndexOf('/') +1);
        System.out.println(listName.lastIndexOf('/'));
        System.out.println(listName);




    }

}
