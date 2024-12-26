package beginner_iniciante;

import java.util.Scanner;

public class Main1178 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n=s.nextDouble();
        double[] v = new double[100];
        double a=0;

        for (int i = 0; i < v.length; i++) {
            v[i] = n;
            a = n/2;
            n = a;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, v[i]);
        }
    }
}