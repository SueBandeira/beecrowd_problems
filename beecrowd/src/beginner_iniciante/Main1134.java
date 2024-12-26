package beginner_iniciante;

import java.util.Scanner;

public class Main1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prod = new int[3];
        int a=0;

        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        while ((a=sc.nextInt()) != 4) {
            switch (a) {
                case 1 -> prod[0] += 1;
                case 2 -> prod[1] += 1;
                case 3 -> prod[2] += 1;
                default -> {
                }
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", prod[0]);
        System.out.printf("Gasolina: %d\n", prod[1]);
        System.out.printf("Diesel: %d\n", prod[2]);
    }
}