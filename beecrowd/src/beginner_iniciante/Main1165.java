package beginner_iniciante;

import java.util.Scanner;

public class Main1165 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total=s.nextInt();
        int n, div=0;

        while (total != 0) {
            n=s.nextInt();
            for (int i = n; i >= 1; i--) {
                if (n % i == 0 && i != n && i != 1) {
                    div=1;
                    break;
                }
            }
            if (div == 0)
                System.out.println(n+" eh primo");
            else
                System.out.println(n+" nao eh primo");
            div=0;    
            total--;
        }
    }
}