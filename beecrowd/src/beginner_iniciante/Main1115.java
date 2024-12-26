package beginner_iniciante;

import java.util.Scanner;

public class Main1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        while ((x=sc.nextInt())!=0 && (y=sc.nextInt())!=0) {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("primeiro");
                } else {
                    System.out.println("quarto");
                }
            } else {
                if (y > 0) {
                    System.out.println("segundo");
                } else {
                    System.out.println("terceiro");
                }
            }
        }
    }
}
