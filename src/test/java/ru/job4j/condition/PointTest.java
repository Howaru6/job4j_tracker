package ru.job4j.condition;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class PointTest {

    @Test
    public void when50to20then3() {
        Point a = new Point(5, 0);
        Point b = new Point(2, 0);
        double expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when73to25then5() {
        Point a = new Point(7, 3);
        Point b = new Point(2, 5);
        double expected = 5.38;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when77to22then7() {
        Point a = new Point(7, 7);
        Point b = new Point(2, 2);
        double expected = 7.07;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}