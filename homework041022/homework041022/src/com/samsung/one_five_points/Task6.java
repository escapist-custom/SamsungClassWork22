package com.samsung.one_five_points;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String res = ((y <= x || y >= -x) && x * x + y * y < 1) ? "YES" : "NO";
        System.out.println(res);
    }
}
