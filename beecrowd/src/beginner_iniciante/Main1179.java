package beginner_iniciante;

import java.util.Scanner;

public class Main1179 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[15];
        int[] par = new int[5];
        int[] impar = new int[5];
        int j=0, k=0;

        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();

            if(num[i] % 2 == 0) {
                par[j] = num[i];
                j++;
                
                if (j > 4) {
                    for (int a =0; a < j; a++) {
                        System.out.printf("par[%d] = %d\n", a, par[a]);
                        par[a] = 0;
                    }
                    j=0;
                }
            } else {
                impar[k] = num[i];
                k++;

                if (k > 4) {
                    for (int b =0; b < k; b++) {
                        System.out.printf("impar[%d] = %d\n", b, impar[b]);
                        impar[b] = 0;
                    }
                    k=0;
                }
            }
        }     
        for (int b =0; b < 5; b++) {
            if (impar[b] != 0) {  
                System.out.printf("impar[%d] = %d\n", b, impar[b]);
            } else
                break;
        } 
        for (int a =0; a < 5; a++) {
            if (par[a] != 0) {  
                System.out.printf("par[%d] = %d\n", a, par[a]);
            } else
                break;
        } 
    }
}