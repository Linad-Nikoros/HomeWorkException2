package org.example;
public class Task1 {
    public static void checkPositiveNumber(int num) throws InvalidNumberException {
        if (num <= 0) throw new InvalidNumberException("Число меньше нуля");
        else System.out.println("Число корректно");
    }
}