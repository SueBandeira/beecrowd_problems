package beginner_iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Main1181 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        double[][] mat = new double[12][12];
        int linha = 0;
        double soma=0, media=0;
        char operacao;

        linha = s.nextInt();
        operacao = s.next().charAt(0);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = s.nextDouble();
                if (i == linha)
                    if (operacao == 'S') 
                        soma += mat[i][j];
                    else if (operacao == 'M')
                        media += mat[i][j];
            }
        }
        if (operacao == 'S') System.out.printf("%.1f\n", soma);
        else if (operacao == 'M') System.out.printf("%.1f\n", media/mat.length);
    }
}