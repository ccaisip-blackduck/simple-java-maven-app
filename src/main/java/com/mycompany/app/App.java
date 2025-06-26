package com.mycompany.app;

/**
 * Hello world!
 * 6/26: add comment and push to main, second push change output
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
