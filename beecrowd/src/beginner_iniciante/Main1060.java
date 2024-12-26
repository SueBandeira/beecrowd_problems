package beginner_iniciante;

import java.util.Scanner;

public class Main1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] nums = new float[6];
        int cont = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextFloat();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                cont += 1;
            }
        }
        System.out.printf("%d valores positivos\n", cont);
    }
}