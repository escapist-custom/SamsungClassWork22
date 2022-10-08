package com.samsung.one_five_points;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = ((y >= x || (y < x && y > 0)) && (y > 0 || y < 0) && y < 2 - x * x) ? "YES" : "NO";
        System.out.println(res);
    }
}
