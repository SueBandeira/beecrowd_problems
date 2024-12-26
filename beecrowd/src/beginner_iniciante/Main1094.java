package beginner_iniciante;

import java.util.Scanner;

public class Main1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total, sapo, coelho, rato;
        rato = sapo = coelho = total = 0; 
        for (int i = 0; i < n; i++) { 
            int quantia = sc.nextInt();
            char caractere = sc.next().charAt(0);
            total += quantia;
            if (caractere == 'R') rato += quantia;
            else if (caractere == 'S') sapo += quantia;
            else if (caractere == 'C') coelho += quantia;
        }
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelho);
        System.out.printf("Total de ratos: %d\n", rato);
        System.out.printf("Total de sapos: %d\n", sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (coelho * 100.0) / total);
        System.out.printf("Percentual de ratos: %.2f %%\n", (rato * 100.0) / total);
        System.out.printf("Percentual de sapos: %.2f %%\n", (sapo * 100.0) / total);
    }
}

