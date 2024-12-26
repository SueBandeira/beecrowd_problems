package beginner_iniciante;

import java.util.Scanner;

public class Main1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        float[][] mat = new float[n][3];
        double[] pesos = {2, 3, 5};
        float[] soma = new float[n];;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextFloat();
                soma[i] += mat[i][j]*pesos[j];
            }
        }
        for (int i = 0; i < soma.length; i++) {
            System.out.printf("%.1f\n",soma[i]/10);
        }
    }
}
