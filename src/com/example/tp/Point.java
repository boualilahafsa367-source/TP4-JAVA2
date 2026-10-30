
package com.example.tp;

public class Point {
    private double x;
    private double y;

    // Constructeur
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Retourne un nouveau point après une translation
    public Point translation(double a, double b) {
        return new Point(this.x + a, this.y + b);
    }

    // Calcule la distance entre deux points
    public static double distance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    // Définit comment afficher un point
    @Override
    public String toString() {
        return "( " + x + " , " + y + " )";
    }
}

