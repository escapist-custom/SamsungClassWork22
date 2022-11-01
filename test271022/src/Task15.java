import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (i < 300) {
            i++;
            count++;
            if (i < 200) continue;
        }
        System.out.println(count);
    }
}
