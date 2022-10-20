package numdigit2;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumOfSeven(a, b));
    }
    public static int sumOfSeven (int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                if (i > 10 && i < 100) {
                    sum += i % 10;
                    sum += i / 10;
                }
            }
        }
        return sum;
    }
}
