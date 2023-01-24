package ru.job4j.calculator;

public class Calculator {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return max(left, max(right, middle));
    }

    public static int max(int left, int right, int middle, int up) {
        return max(left, (max(middle, up)));
    }

    public static void main(String[] args) {
        int result = Calculator.max(9, 5, 4, 17);
        System.out.println(result);
    }
}