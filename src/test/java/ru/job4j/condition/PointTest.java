package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to70then4dot47() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 7;
        int y2 = 0;
        double expected = 4.47;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1negative4to64then9dot43() {
        int x1 = 1;
        int y1 = -4;
        int x2 = 6;
        int y2 = 4;
        double expected = 9.43;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}