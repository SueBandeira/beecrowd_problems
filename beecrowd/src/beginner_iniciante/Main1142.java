package beginner_iniciante;

import java.util.Scanner;

public class Main1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cont=0, a=0;

        for (int i = 1; i <= n; i++) {
            if (i == 1)
                cont = i;
            else 
                cont = a + 4;
            a = cont;
            while (cont <= a+2) { 
                System.out.printf("%d ", cont);
                cont += 1;
            }
            System.out.println("PUM");
        }
    }
}
