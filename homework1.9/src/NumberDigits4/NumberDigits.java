package NumberDigits4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextFloat();
        int n = scanner.nextInt();
    }
    public static void binFraction(double x, int n) {
        String res;
        int numb = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            x *= 2;
            if (x >= 1) {
                x -= 1;
                numb = 1;
            }
            res = String.valueOf(numb);
            stringBuilder.append(res);
            numb = 0;
        }
        System.out.println(stringBuilder);
    }
}
