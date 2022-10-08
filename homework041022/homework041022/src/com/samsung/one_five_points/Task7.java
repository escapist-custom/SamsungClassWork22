package com.samsung.one_five_points;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String res = (x < 1 && y > 1 - x && (y > 2 * x * x || (y < 2 * x * x && x > 0))) ? "YES" : "NO";
        System.out.println(res);
    }
}
