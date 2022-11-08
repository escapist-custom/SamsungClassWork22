package com.samsung.homework2.homework2_2_3;


public class GraphPoint{
    static float x;
    static float y;
    public GraphPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public GraphPoint() {}
    public static void main(String[] args) {
        GraphPoint gp = new GraphPoint(500, 300);
        System.out.println(x + " " + y);
    }
}