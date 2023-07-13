package org.example;
public class Main {
    public static void main(String[] args) {
        try {
            Task1.checkPositiveNumber(4);
        }
        catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}