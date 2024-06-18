package com.example.circle;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
    private double radius;
    public Circle(double radius) {this.radius = radius;}
    public double getRadius() {return radius;}
    public void setRadius(double radius) {if (radius < 0) {throw new IllegalArgumentException("Radius cannot be negative");} else {this.radius = radius;}}

    public double getArea() {return Math.PI * Math.pow(radius, 2);}
    public double getPerimeter() {return 2 * Math.PI * radius;}
}
