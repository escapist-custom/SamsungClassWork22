package com.samsung;

public class Task16 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 4, 6};
        int[] array = rotRight(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] rotRight(int[] array) {
        int pre = 0;
        int pre1 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                pre = array[i];
                array[i] = array[array.length - 1];
            } else {
                pre1 = array[i];
                array[i] = pre;
            }
            pre = pre1;
        }
        return array;
    }
}
