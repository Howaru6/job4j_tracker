package ru.job4j.condition;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class PointTest {

    @Test
    public void when540to210to340then3() {
        Point a = new Point(5, 4, 0);
        Point b = new Point(2, 1, 0);
        Point z = new Point(3, 4, 2);
        double expected = 4.24;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to200to002then5() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 0, 0);
        Point z = new Point(0, 0, 2);
        double expected = 1.73;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when963to842to753then2() {
        Point a = new Point(9, 6, 3);
        Point b = new Point(8, 4, 2);
        Point z = new Point(7, 5, 3);
        double expected = 2.44;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to001tp002then7() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 1);
        Point z = new Point(0, 0, 2);
        double expected = 1;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}