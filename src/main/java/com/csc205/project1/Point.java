package com.csc205.project1;

public class Point {

    private double x;
    private double y;
    private double distance;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        distance = Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
        return distance;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        x = x + n;
    }

    public void shiftY(double n) {
        y = y + n;
    }

    public void rotate(double angle) {
        x = x * Math.cos(angle) - y * Math.sin(angle);
        y = x * Math.sin(angle) + y * Math.cos(angle);
    }

    @Override
    public String toString() {
        return "Point {" + "x=" + x + ", y=" + y + '}';
    }
}
