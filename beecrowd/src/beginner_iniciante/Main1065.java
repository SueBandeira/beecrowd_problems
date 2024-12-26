package beginner_iniciante;
import java.util.Scanner;

public class Main1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int cont = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                cont += 1;
            }
        }
        System.out.printf("%d valores pares\n", cont);
    }
}
