package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return  Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return  Math.sqrt(Math.pow(this.x - that.x, 2)
                + Math.pow(this.y - that.y, 2)
                + Math.pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, -4);
        Point b = new Point(6, 4);
        double dist = a.distance(b);
        System.out.println("Result (1, -4) to (6, 4) : " + dist);
    }
}
