package DesignPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Point {
    private final int x, y; // immutable
    private static Map<String, Point> instances = new HashMap<String, Point>();

    public static Point getInstance(int x, int y) {
        String key = x + ", " + y;
        if (instances.containsKey(key)) {
            return instances.get(key);
        }
        Point p = new Point(x, y);
        instances.put(key, p);
        return p;
    }

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Point p1 = Point.getInstance(1, 2);
        Point p2 = Point.getInstance(1, 2);
        System.out.println(p1 == p2); // true, same instance

    }
}