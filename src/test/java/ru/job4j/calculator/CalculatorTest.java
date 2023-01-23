package ru.job4j.calculator;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Calculator.max(left, right);
        int expected = 2;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To4Then5() {
        int left = 5;
        int right = 4;
        int result = Calculator.max(left, right);
        int expected = 5;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To4To5Then7() {
        int left = 7;
        int right = 4;
        int middle = 5;
        int result = Calculator.max(left, right, middle);
        int expected = 7;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1To5Then5() {
        int left = 2;
        int right = 1;
        int middle = 5;
        int result = Calculator.max(left, right, middle);
        int expected = 5;
        Assertions.assertThat(result).isEqualTo(expected);

    }
}
