package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Ma {
    public String hello(){
        List<String> list=new ArrayList<>();
        list.add("he");
        list.forEach(System.out::println);
        return "hello";
    }
}
