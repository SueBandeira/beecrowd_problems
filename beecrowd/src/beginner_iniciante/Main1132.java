package beginner_iniciante;

import java.util.Scanner;

public class Main1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        int soma=0;

        if (m > n) {
            int aux = m;
            m = n;
            n = aux;
        } 
        for (int i = m; i <= n; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}