package com.samsung.one_eight;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        int count = 0;
        int nums[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            nums[i] = count;
        }
        int max = 0;
        int res = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                res = array[i];
                index = i;
            } else if (nums[i] == max) {
                if (i < index) {
                    res = array[index];
                }
            }
        }
        System.out.println(res);
    }
}