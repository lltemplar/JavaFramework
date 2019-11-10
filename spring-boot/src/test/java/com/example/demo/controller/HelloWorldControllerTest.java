package com.example.demo.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {
    @Test
    public void sayHello() throws Exception {
        new HelloWorldController().sayHello();
    }

}