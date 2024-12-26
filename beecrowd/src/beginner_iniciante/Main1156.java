package beginner_iniciante;

import java.util.Scanner;

public class Main1156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s=1, a=2;

        for (double i = 3; i <= 39; i=i+2) {
            s += i/a;
            a = a+a;
        }
        System.out.printf("%.2f\n", s);
    }
}
