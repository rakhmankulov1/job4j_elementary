package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistanceX2Then2() {
        int inx1 = 0;
        int inx2 = 2;
        int iny1 = 0;
        int iny2 = 0;
        double expected = 2.0;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}