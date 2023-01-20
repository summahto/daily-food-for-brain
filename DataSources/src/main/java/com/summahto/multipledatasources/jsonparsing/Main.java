package com.crio.jsonparsing;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {

    public static void main(String args[]) throws IOException {
        Path path = Paths.get("src/main/java/com/crio/jsonparsing/trades.json");

        File file = new File("src/main/java/com/crio/jsonparsing/trades.json");
        System.out.println(file.exists());

        ObjectMapper mapper = new ObjectMapper();




    }

}