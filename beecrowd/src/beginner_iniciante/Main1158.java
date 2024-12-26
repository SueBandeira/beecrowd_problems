package beginner_iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Main1158 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] par = new int[n][2];
        int qtd=0, b=0, a=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                par[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            a = par[i][0];
            if (a % 2 == 0)
                a++;
            for (int k = 1; k <= par[i][1]; k++) {
                //System.out.print(a + " ");
                qtd += a;
                a += 2;
            }
            System.out.println("\n"+qtd);
            qtd =0; 
        }
    }
}
/* 
2
4 3
11 2
*/