package beginner_iniciante;
import java.util.Scanner;

public class Main1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int par = 0, impar =0, positivo=0, negativo=0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                par += 1;
            }else{
                impar += 1;
            }
            if (nums[i] > 0) {
                positivo += 1;
            }else if(nums[i] < 0){
                negativo += 1;
            }
        }
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n", par, impar);
        System.out.printf("%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",
                        positivo, negativo);
    }
}