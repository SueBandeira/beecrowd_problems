package beginner_iniciante;

import java.util.Scanner;

public class Main1183 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char caracter=s.next().charAt(0);
        double[][] m = new double[12][12];
        double soma=0;
        int cont = 1, qtd=0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j]=s.nextDouble();
                //0 1
                if (j >= cont) {
                    soma+=m[i][j];
                    qtd++;
                    cont++;
                }
            }
            if (i < 12)
                cont = i+2;
        }
        if (caracter == 'S') System.out.printf("%.1f\n", soma);
        else if (caracter == 'M') System.out.printf("%.1f\n", soma/qtd); 
    }
}
