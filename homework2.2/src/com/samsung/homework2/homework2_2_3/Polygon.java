package com.samsung.homework2.homework2_2_3;

public class Polygon {
    static float[] x, y;
    public Polygon() {
    }
    public Polygon(Polygon pol) {
        for (int i = 0; i < pol.x.length; i++) {
            this.x[i] = pol.x[i];
            this.y[i] = pol.y[i];
        } 
    }
   /* public static void main(String[] args) {
        Polygon a = new Polygon(x, y);
        for (int i = 0; i < p);
        System.out.println();
    }*/
}
