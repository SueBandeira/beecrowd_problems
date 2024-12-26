package beginner_iniciante;

import java.util.Scanner;

public class Main1176 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int cont=n, i, r;
    
        while (cont > 0) {
            r = s.nextInt();
            long[] fibo = new long[r+1];
            for (i = 0; i <= r; i++) {
                if (i == 0)
                    fibo[i] = (long) 0.0;
                else if (i == 1)
                    fibo[i] = (long) 1.0;
                else
                    fibo[i] = fibo[i-1]+fibo[i-2];
            }
            System.out.printf("Fib(%d) = %d\n", r, fibo[r]);
            cont--;
        }
    }
}
