package com.samsung.one_eight_add2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
