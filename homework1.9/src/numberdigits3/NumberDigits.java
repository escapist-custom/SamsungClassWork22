package numberdigits3;

import java.sql.SQLOutput;
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

        for (int i = 0; i < number; i++) {
            for (int j = i; j < )
            if (i % 10 + i / 10 == 13) {
                sum++;
            }
        }
        return sum;
    }
}
