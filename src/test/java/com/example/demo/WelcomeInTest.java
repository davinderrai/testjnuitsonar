package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Integrartion test")
class WelcomeInTest {


    @Test
    @DisplayName("test 1")
    void add1() {
        Welcome w1 = new Welcome();
        assertEquals(30, w1.add(10, 20));
    }

    @Test
    @DisplayName("test 2")
    void add2() {
        Welcome w1 = new Welcome();
        assertEquals(20, w1.add(5, 15));
    }
}