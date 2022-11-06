package com.samsung.homework2;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    static int count;

    public Vector2D () {
        vX = 1;
        vY = 1;
        count++;
    }
    public Vector2D (double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D (Vector2D v) {
        this.vX = v.vX;
        this.vY = v.vY;
        count++;
    }
    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }

    //---------------------------------------------------------------------------------------------------------------
    // Second task

    public double length() {
        double sum = Math.sqrt(vX * vX + vY * vY);
        return sum;
    }

    public void add(Vector2D v) {
        vX += v.vX;
        vY += v.vY;
    }

    public void sub(Vector2D v) {
        vX -= v.vX;
        vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    //-----------------------------------------------------------------------------------------------------------------
    // Third task

    public void normalized() {
        vX = 1;
        vY = 0;
    }

    public double dotProduct(Vector2D v) {
        v.vX *= vX;
        v.vY *= vY;
        double sum1 = v.vX + v.vY;
        return sum1;
    }

    public static void main(String[] args) {
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(5.0, 7.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(1.5);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(2);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}
