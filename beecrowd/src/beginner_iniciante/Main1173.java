package beginner_iniciante;

import java.util.Scanner;

public class Main1173 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            if (n==1 || n==0) {
                vet[i] = n;
                n++;
            }else if(i == 0)
                vet[i] = n;
            else
                vet[i] = vet[i-1]*2;
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vet[i]);
        }
    }
}