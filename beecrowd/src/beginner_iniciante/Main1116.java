package beginner_iniciante;

import java.util.Scanner;

public class Main1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] valores = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                valores[i][j] = sc.nextInt();
            }
            if (valores[i][1] != 0) {
                double a = valores[i][0];
                double b = valores[i][1];
                System.out.printf("%.1f \n", a/b);
            } else {
                System.out.println("divisao impossivel");
            }
        }
    }
}