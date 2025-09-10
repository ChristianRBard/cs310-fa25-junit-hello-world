package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        if (message == null) {
            return null; // handle null input gracefully
        }
        // Use StringBuilder's built-in reverse method
        return new StringBuilder(message).reverse().toString();
    }
    
    public String getQuote() {
        return "A Weapon to Surpass Metal Gear";
    }
}