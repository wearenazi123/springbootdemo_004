package com.example.demo;


import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * 测试Java自带的Log日志功能
 * @author sxd
 *
 */
public class TestLog {

    public void test() throws SecurityException, IOException{
        Logger log1 = Logger.getLogger("log-Test");
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        log1.addHandler(consoleHandler);

        FileHandler fileHandler = new FileHandler("d:/testLog%g.log");
        fileHandler.setLevel(Level.WARNING);
        log1.addHandler(fileHandler);

        log1.info("ALL级别打印：info级别的日志信息");
        log1.severe("warning级别打印：severe级别日志信息");

    }

}
