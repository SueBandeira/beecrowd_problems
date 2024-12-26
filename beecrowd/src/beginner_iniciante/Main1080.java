package beginner_iniciante;

import java.util.Scanner;

public class Main1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, maior =0, posicao = 0;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            num = sc.nextInt();
            if(num > maior) {
                maior = num;
                posicao = i;
            }
        }
        System.out.printf("%d\n%d\n", maior, posicao);
    }
}