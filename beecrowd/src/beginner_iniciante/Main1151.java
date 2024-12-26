package beginner_iniciante;

import java.util.Scanner;

public class Main1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int[] fibo = new int[n];

        while (i < n) {
            if(i == 0)
                fibo[0] = 0;
            else if (i == 1) 
                fibo[1] = 1;
            else 
                fibo[i] = fibo[i-1] + fibo[i-2];  
            i++;
        }
        for (int j = 0; j < fibo.length; j++) {
            if (j < fibo.length-1)
                System.out.printf("%d ", fibo[j]);
            else
                System.out.printf("%d\n", fibo[j]);
        }
    }
}
