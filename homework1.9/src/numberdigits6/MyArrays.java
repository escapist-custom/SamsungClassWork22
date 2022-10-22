package numberdigits6;


import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int number = scanner.nextInt();
        }
        minToBegin(arr);
    }
    public static int[] minToBegin(int[] array) {
        int min = 999999999;
        int I = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                I = i;
            }
        }

        while (I >= 1) {
            array[I] = array[I - 1];
            I--;
        }
        array[0] = min;
        return array;
    }
}
