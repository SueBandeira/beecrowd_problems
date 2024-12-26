package beginner_iniciante;

import java.util.Scanner;

public class Main1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        while ((m = sc.nextInt())!=(n = sc.nextInt())) {
            if (m > n) {
                System.out.println("Decrescente");
            }else {
                System.out.println("Crescente");
            }
        }
    }
}
