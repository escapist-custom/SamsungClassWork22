package com.samsung.one_eight;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int array[];
        int index = 1;
        boolean flag = false;
        array = new int[n];
        for (int i=0; i < n; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        int x = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(index + 1);
        } else {
            System.out.println("NO");
        }
    }
}
