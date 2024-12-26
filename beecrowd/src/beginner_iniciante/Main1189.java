package beginner_iniciante;

import java.util.Scanner;

public class Main1189 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char caracter=s.next().charAt(0);
        double[][] m = new double[12][12];
        double soma=0;
        int qtd=0, aux=1;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j]=s.nextDouble();
                if (i > 0 && j < aux && i < 11) {
                    soma+=m[i][j];
                    qtd++;
                } 
            }
            if (i > 0 && i < 5)
                aux++;
            else if (i >= 6 && i < 11)
                aux--;
        }
        if (caracter == 'S') System.out.printf("%.1f\n", soma);
        else if (caracter == 'M') System.out.printf("%.1f\n", soma/qtd);
    }
}