package com.summahto.java8.training.day2;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Profile {

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Util date " + new Date());
//        System.out.println("Sql Date "  + new java.sql.Date(System.currentTimeMillis()));
        LocalDate d1 = LocalDate.of(2021, 12, 2);
        System.out.println(d1);

//        System.out.println("Enter the year : ");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        System.out.println("Enter the month : ");
//        int month = sc.nextInt();
//        System.out.println("Enter the day : ");
//        int day = sc.nextInt();
//
//        d1 = LocalDate.of(year, month, day);
//        System.out.println(d1);


        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a Nashorn script engine
        ScriptEngine engine = factory.getEngineByName("nashorn");
        // evaluate JavaScript statement
        try {
            URL url = Lab4.class.getResource("hello.js");
            engine.eval(new FileReader(url.toString()));

        } catch (final ScriptException | FileNotFoundException se) {
            se.printStackTrace();
        }
    }

}
