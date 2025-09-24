package com.example.app;

/**
 * Simple Java Application for Jenkins CI/CD Demo
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("🚀 Hello from Jenkins CI/CD!");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Build successful! ✅");
        
        App app = new App();
        String result = app.getMessage();
        System.out.println("Message: " + result);
    }
    
    /**
     * Returns a greeting message
     * @return greeting message
     */
    public String getMessage() {
        return "Welcome to Jenkins with Java 17!";
    }
    
    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Checks if a number is even
     * @param number the number to check
     * @return true if even, false if odd
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}