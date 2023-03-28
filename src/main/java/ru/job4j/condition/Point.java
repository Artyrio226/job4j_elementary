package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int firstSubtraction = x2 - x1;
        int secondSubtraction = y2 - y1;
        double firstPow = Math.pow(firstSubtraction, 2);
        double secondPow = Math.pow(secondSubtraction, 2);
        double sum = firstPow + secondPow;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(3, 2, 7, 0);
        double result3 = Point.distance(1, -4, 6, 4);
        System.out.println("result1 (0, 0) to (2, 0) " + result1);
        System.out.println("result2 (3, 2) to (7, 0) " + result2);
        System.out.println("result3 (1, -4) to (6, 4) " + result3);
    }
}
