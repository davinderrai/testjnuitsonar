package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //SpringApplication.run(DemoApplication.class, args);
        Welcome welcome = new Welcome();
        System.out.println("Total " + welcome.add(10, 20));
    }

}
