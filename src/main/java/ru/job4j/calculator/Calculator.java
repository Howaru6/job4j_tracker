package ru.job4j.calculator;

public class Calculator {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        int tmp = max(right, middle);
        return max(left, tmp);
    }

    public static void main(String[] args) {
        int result = Calculator.max(9, 5, 4);
        System.out.println(result);
    }
}