package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    private static int y;

    private int a;

    private int m;

    private int n;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int m) {
        return x - m;
    }

    public static int divide(int n) {
        return n / x;
    }

    public int sumAllOperation(int s) {
        return y + a + m + n + s;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        Calculator calculator1 = new Calculator();
        int rsl1 = calculator1.sumAllOperation(5);
        int result = sum(10);
        int result1 = minus(10);
        int result2 = divide(10);
        System.out.println(result);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(result1);
        System.out.println(result2);
    }
}

