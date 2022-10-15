package com.samsung.one_seven;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = 1;

        while (n % 5 != 0) {
            n = scanner.nextInt();
            if (n > 10) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
