package com.samsung.one_five_points;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String res = (y < Math.sin(x) && y < 0.5 && y > 0 && x < Math.PI & x > 0) ? "YES" : "NO";
        System.out.println(res);
    }
}
