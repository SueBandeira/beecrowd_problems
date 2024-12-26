package beginner_iniciante;

import java.util.Scanner;

public class Main1172 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = s.nextInt();
            if (vet[i] <1)
                vet[i] = 1;
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("X[%d] = %d\n", i, vet[i]);
        }

    }
}