package beginner_iniciante;

import java.util.Scanner;

public class Main1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int valor = i*n;
            System.out.printf("%d x %d = %d\n", i, n, valor);
        }
    }
}