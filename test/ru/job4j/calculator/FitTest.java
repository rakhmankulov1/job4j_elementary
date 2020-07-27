package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double inW = 187;
        double expectedW = 88.55;
        double outW = Fit.womanWeight(inW);
        Assert.assertEquals(expectedW, outW, 0.01);
    }
}