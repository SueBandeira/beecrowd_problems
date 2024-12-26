package beginner_iniciante;
import java.util.Scanner;

public class Main1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, soma=0;

        inicio = sc.nextInt();
        fim = sc.nextInt();
        sc.close();

        for (int i = inicio-1; i > fim; i--) {
            if(i % 2 != 0 )
                soma += i;
        }
        System.out.printf("%d\n", soma);
    }
}