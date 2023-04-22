package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ma {
    public String hello(){
        List<String> list=new ArrayList<>();
        list.add("he");
        list.forEach(System.out::println);

        Logger log = Logger.getLogger("lavasoft");
        log.setLevel(Level.INFO);
        Logger log1 = Logger.getLogger("lavasoft");
        System.out.println(log==log1);     //true
        Logger log2 = Logger.getLogger("lavasoft.blog");
        log2.setLevel(Level.WARNING);

        log.info("aaa");
        log2.info("bbb");
        log2.fine("fine");
        return "hello";
    }
}
