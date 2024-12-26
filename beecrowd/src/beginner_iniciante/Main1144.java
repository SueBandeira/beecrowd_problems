package beginner_iniciante;

import java.util.Scanner;

public class Main1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n=sc.nextLong();

        for (int i = 1; i <= n*2; i++) {
            double a = i;
            System.out.format("%d %d %d\n", (long) a, (long) (a*a), (long) (a*a));
            System.out.format("%d %d %d\n", (long) a, (long) ((a*a)+1), (long) ((a*a*a)+1));
        }
    }
}