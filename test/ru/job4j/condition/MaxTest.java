package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxLeftToRightThen3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenBothEqualThen3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2And3Then3() {
        int result = Max.max(1, 2,3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxLeftToRightAndUpThen5() {
        int result = Max.max(3, 2,5);
        assertThat(result, is(5));
    }

    @Test
    public void whenBothEqual3Then3() {
        int result = Max.max(3, 3,3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2And3And4Then4() {
        int result = Max.max(1, 2,3,4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxLeftToRightAndUpAndDownThen5() {
        int result = Max.max(3, 2,5,4);
        assertThat(result, is(5));
    }

    @Test
    public void whenBothEqual5Then5() {
        int result = Max.max(5, 5,5,5);
        assertThat(result, is(5));
    }
}