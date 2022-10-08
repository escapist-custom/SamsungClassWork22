package com.samsung.one_five_points;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String res = ((x * x + y * y < 1 || (x * x + y * y > 1 && x >= 0 && y > 0)) && y <= 1 && x >=0 && (y > x - 1 || y < 0)) ? "YES" : "NO";
        System.out.println(res);
    }
}
