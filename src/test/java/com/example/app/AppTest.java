package com.example.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for App class
 */
public class AppTest {
    
    private App app;
    
    @BeforeEach
    void setUp() {
        app = new App();
    }
    
    @Test
    void testGetMessage() {
        String expected = "Welcome to Jenkins with Java 17!";
        String actual = app.getMessage();
        assertEquals(expected, actual, "Message should match expected value");
    }
    
    @Test
    void testAddition() {
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, app.add(-1, 1), "-1 + 1 should equal 0");
        assertEquals(-5, app.add(-2, -3), "-2 + (-3) should equal -5");
    }
    
    @Test
    void testIsEven() {
        assertTrue(app.isEven(2), "2 should be even");
        assertTrue(app.isEven(0), "0 should be even");
        assertFalse(app.isEven(3), "3 should be odd");
        assertFalse(app.isEven(-1), "-1 should be odd");
    }
}