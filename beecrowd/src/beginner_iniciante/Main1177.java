package beginner_iniciante;
import java.util.Scanner;

public class Main1177 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] v = new int[100];
        int cont=0;
        for (int i = 0; i < v.length; i++) {
            if (cont < n) {
                v[i] = cont;
                cont++;
            } else {
                cont=1;
            }
            
        }
        for (int i = 0; i < v.length; i++) {
            System.out.printf("N[%d] = %d\n", i, v[i]);
        }
    }
}