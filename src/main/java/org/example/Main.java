package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Anastacio");
        list.add("Juan");
        list.add("Maria");

        for (String lista:list){
            System.out.println(lista);
        }
        list.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);

    }
}