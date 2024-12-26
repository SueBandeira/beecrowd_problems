package beginner_iniciante;

import java.util.Scanner;

public class Main1164 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=sc.nextInt();
        int n, soma=0;

        while (total != 0) {
            n=sc.nextInt();
            for (int i = n-1; i >= 1; i--) {
                if (n % i == 0) {
                    soma += i;
                }
            }
            if (soma == n)
                System.out.println(n+" eh perfeito");
            else
                System.out.println(n+" nao eh perfeito");
            soma=0;    
            total--;
        }
     }
}
