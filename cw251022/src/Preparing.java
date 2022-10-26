import java.util.Scanner;

public class Preparing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*double a = in.nextDouble();
        in.next();
        double b = in.nextDouble();
        in.next();
        double c = in.nextDouble();
        double result = a + b + c;
        System.out.println(result);*/

        int c = 0;
        int x = scanner.nextInt();
        while (x < 100) {
            c++;
            x++;
        }
        if (x >= 100) {
            x++;
            c++;
        }
        System.out.println(c + " " + x);
    }
}
