package beginner_iniciante;

import java.util.Scanner;

public class Main1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        int cont=0, a=0, index=1, b=0, j=0, div=0;

        div = y/x;
        for (int i = 1; i <= div; i++) {
            if (i == 1)
                cont = i;
            else if (b == x)
                cont = a + x;
            a = cont;
            index = a + x-1;
            for (j = a; j <= index; j++) {
                
                if (j < index)
                    System.out.printf("%d ", j);
                else {
                    System.out.printf("%d\n", j);
                    b = x;
                }
            }
        }   
    }
}
