package beginner_iniciante;

import java.util.Scanner;

public class Main1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0;

        while ((n=sc.nextInt()) != 0) {
            if (n % 2 != 0) {
                n++;
            }
            int step = n+5;
            for (int i = n; i < step; i++) {
                sum += n;
                n += 2;
            }
            System.out.println(sum);
            sum=0;
        }
        
    }
}
