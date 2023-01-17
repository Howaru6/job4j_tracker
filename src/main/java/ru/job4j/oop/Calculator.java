package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int divide(int n) {
        return n / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + multiply(s) + minus(s) + divide(s);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rsl1 = calculator.sum(5);
        int rsl2 = calculator.multiply(10);
        int rsl3 = calculator.minus(15);
        int rsl4 = calculator.divide(20);
        int rsl5 = calculator.sumAllOperation(25);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
        System.out.println(rsl5);

    }
}

