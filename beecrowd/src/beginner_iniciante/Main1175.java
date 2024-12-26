package beginner_iniciante;

import java.util.Scanner;

public class Main1175 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[20];
        int aux=0, j=1;

        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }

        //ver quando o tamanho do vetor é impar
        for (int i = 0; i < n.length/2; i++) {
                aux=n[i];
                n[i] = n[n.length - j];
                n[n.length - j] = aux;
                j++;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
/*
0
-5
7
2
63
230

230
63
2
7
-5
0
 */
