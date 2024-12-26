package beginner_iniciante;

import java.util.Scanner;

public class Main1188 {
    public static void mostrarMat(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.printf("%.1f(%d,%d) ", m[i][j], i, j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char caracter=s.next().charAt(0);
        double[][] m = new double[12][12];
        double soma=0;
        int qtd=0, aux=2;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j]=s.nextDouble();
                if (i > 6 && j >= i-aux && j < i) {
                    soma+=m[i][j];
                    qtd++;
                } 
            }
            
            if (i > 6) {
                System.out.println();
                aux+=2;
            }
        }
        if (caracter == 'S') System.out.printf("%.1f\n", soma);
        else if (caracter == 'M') System.out.printf("%.1f\n", soma/qtd);
    }
}
