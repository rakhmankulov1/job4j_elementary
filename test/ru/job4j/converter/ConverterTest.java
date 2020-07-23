package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int inDol = 180;
        int expectedDol = 3;
        int outDol = Converter.rubleToDollar(inDol);
        Assert.assertEquals(expectedDol, outDol);
    }
}