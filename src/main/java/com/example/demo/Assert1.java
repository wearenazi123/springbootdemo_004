package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class Assert1 {

    @Test
    public void helloTest() {
        Ma m = new Ma();
        String ma = m.hello();
        Assert.assertEquals("hello", ma);
    }
}
