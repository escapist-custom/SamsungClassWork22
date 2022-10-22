package comsamsung.numberdigits3;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfThirteen(n));
    }
    public static int sumOfThirteen (int number) {
        int sum = 0;
        int ins_sum = 0;
        int num = 0;
        for (int i = 0; i < number; i++) {
            int j = i;
            while (j >= 1) {
                j /= 10;
                ins_sum += j;
            }
            if (ins_sum == 13) {
                sum++;
            }
            ins_sum = 0;
        }
        return sum;
    }
}