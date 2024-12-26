package beginner_iniciante;

import java.util.Scanner;

public class Main1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt(), Z=sc.nextInt();
        int sum=0, i=0, b=X, qtd=0;

        while (Z < X) {
            Z=sc.nextInt();
        }

        while (sum <= Z+1) {
            sum += X++;
            qtd += 1;
            //System.out.println("Sum: "+sum+ " Qtd: "+ qtd);
        }
        System.out.println(qtd);
    }
}