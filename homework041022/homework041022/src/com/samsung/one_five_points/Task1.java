package com.samsung.one_five_points;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String res = (y < x && x < 2 && (x * x + y * y) > 4 && y > 0) ? "YES" : "NO";
        System.out.println(res);
    }
}
