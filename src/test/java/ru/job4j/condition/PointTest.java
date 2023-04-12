package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to70then4dot47() {
        Point a = new Point(3, 2);
        Point b = new Point(7, 0);
        double expected = 4.47;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1negative4to64then9dot43() {
        Point a = new Point(1, -4);
        Point b = new Point(6, 4);
        double expected = 9.43;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}