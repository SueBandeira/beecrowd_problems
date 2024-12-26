package beginner_iniciante;

import java.util.Scanner;

public class Main1174 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] a =  new double[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextDouble();
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 10)
                System.out.printf("A[%d] = %.1f\n", i, a[i]);
        }
    }
}