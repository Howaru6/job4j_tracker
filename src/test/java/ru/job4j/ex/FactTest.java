package ru.job4j.ex;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {

    @Test
    public void whenFactEx() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact.calc(-2);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }

    @Test
    public void whenFactNotEx() {
        int n = 4;
        int expected = 24;
        int rsl = Fact.calc(n);
        assertThat(rsl).isEqualTo(expected);
    }
}