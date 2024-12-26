package beginner_iniciante;

import java.util.Scanner;

public class Main1180 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] v = new int[n];
        int menor=100, position=0;

        for (int i = 0; i < v.length; i++) {
            v[i] = s.nextInt();
            if (v[i] < menor) {
                menor = v[i];
                position = i;
            }
        }
        System.out.printf("Menor valor: %d\nPosicao: %d\n", menor, position);
    }
}