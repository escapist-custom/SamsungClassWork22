package comsamsung.numberdigits3;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfThirteen(n));
    }
    public static int sumOfThirteen(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (sumOfDigits(i) % 13 == 0) sum++;
        }
        return sum;
    }
    public static int sumOfDigits(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}