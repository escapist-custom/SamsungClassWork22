package all_numbers.numberdigits5;

import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }
        System.out.printf("%.2f %n", avgOf4Digit(arr));
    }
    public static double avgOf4Digit (int[] array) {
        double sum = 0;
        double amount = 0;
        double res = -1.00;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 1000 && array[i] <= 9999) {
                sum += array[i];
                amount++;
                flag = true;
            }
        }
        if (flag) {
            res = sum / amount;
        }
        return res;
    }
}
