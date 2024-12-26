package beginner_iniciante;
import java.util.Scanner;

public class Main1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();
        sc.close();

        for (int i = 01; i <= num; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}