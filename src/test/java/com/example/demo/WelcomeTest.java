package com.example.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A stack")
class WelcomeTest {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each\n");
    }

    @Test
    @Tag("PROD")
    @DisplayName("test with single digit")
    void add1() {
        Welcome w1 = new Welcome();
        assertEquals(3, w1.add(1, 2));
    }

    @Test
    @Tag("DEV")
    @DisplayName("test with two digit")
    void add2() {
        Welcome w1 = new Welcome();
        assertEquals(20, w1.add(5, 15));
    }

    @Test
    @Tag("PROD")
    @DisplayName("test with three digit")
    void add3() {
        Welcome w1 = new Welcome();
        assertEquals(515, w1.add(500, 15));
    }

    @BeforeAll
    static void setupAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("after all");
    }
}