package beginner_iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Main1160 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int i, j;
        int[] anos =new int[t];
        double[][] pop = new double[t][4];

        for (i = 0; i < t; i++) {
            for (j = 0; j < 4; j++) {
                pop[i][j] = sc.nextDouble();
            }
        }
        i=0;
        while (i < t) {
            pop[i][0] += (int) ((pop[i][2]*pop[i][0])/100);
            pop[i][1] += (int) ((pop[i][3]*pop[i][1])/100);
                
            anos[i] += 1;
            
            if (pop[i][0] >  pop[i][1] || anos[i] > 100) {
                i++;
            }
        }
        for (i = 0; i < t; i++) {
            if (anos[i] <= 100)
                System.out.println(anos[i]+" anos.");
            else
                System.out.println("Mais de 1 seculo.");
        }
    } 
}