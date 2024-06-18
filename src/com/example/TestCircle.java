package com.example;

import com.example.circle.Circle;

public class TestCircle {

    private final double EPSILON = 0.00001;

    private boolean compareDouble(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    private void testCreateCircle() {
        Circle circle = new Circle(10);
        double radius = circle.getRadius();
        if (compareDouble(radius, 10.0)) {
            System.out.println("testCreateCircle: OK");
        } else {
            System.out.println("testCreateCircle: FAILURE");
        }
    }

    private void testSetRadius() {
        Circle circle = new Circle(1);
        if (!compareDouble(circle.getRadius(), 1)) {
            System.out.println("testSetRadius: FAILURE: expected getRadius() = 1, got " + circle.getRadius());
            return;
        }
        circle.setRadius(2.0);
        if (!compareDouble(circle.getRadius(), 2)) {
            System.out.println("testSetRadius: FAILURE: expected r = 2, got " + circle.getRadius());
            return;
        }
        try {
            circle.setRadius(-2.0); // Попытка установить отрицательное значение радиуса
            System.out.println("testSetRadius: FAILURE: Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            if (!compareDouble(circle.getRadius(), 1)) { // Проверяем, что радиус не изменился
                System.out.println("testSetRadius: OK");
            } else {
                System.out.println("testSetRadius: FAILURE: Radius was expected to remain unchanged");
            }
        }
    }

    private void testGetArea() {
        Circle circle = new Circle(2);
        if (compareDouble(circle.getArea(), Math.PI * 4)) {
            System.out.println("testGetArea: OK");
        } else {
            System.out.println("testGetArea: FAILURE");
        }
    }

    private void testGetPerimeter() {
        Circle circle = new Circle(2);
        if (compareDouble(circle.getPerimeter(), Math.PI * 4)) {
            System.out.println("testGetPerimeter: OK");
        } else {
            System.out.println("testGetPerimeter: FAILURE");
        }
    }

    private void compareCircles() {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(2);
        if (compareDouble(circle1.getArea(), circle2.getArea())) {
            System.out.println("compareCircles: OK");
        } else {
            System.out.println("compareCircles: FAILURE");
        }
    }

    public void test() {
        testCreateCircle();
        testSetRadius();
        testGetArea();
        testGetPerimeter();
        compareCircles();
    }
}
