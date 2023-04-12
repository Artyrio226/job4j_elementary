package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To2Then7() {
        int left = 7;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax11To46Then46() {
        int left = 11;
        int right = 46;
        int result = Max.max(left, right);
        int expected = 46;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5And5And7Then7() {
        int first = 5;
        int second = 5;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2And16And23And23Then23() {
        int first = 2;
        int second = 16;
        int third = 23;
        int fourth = 23;
        int result = Max.max(first, second, third, fourth);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }
}