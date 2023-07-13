package org.example;

public class Task2 {
    public static void DivisionZero(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0) throw new DivisionByZeroException("Деление на ноль");
        double result = num1 / num2;
        System.out.println(result);
    }
}
