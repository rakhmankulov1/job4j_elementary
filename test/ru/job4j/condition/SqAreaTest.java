package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenSquareP4K1Then1() {
        int inP = 4;
        int inK = 1;
        double expected = 1.0;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}