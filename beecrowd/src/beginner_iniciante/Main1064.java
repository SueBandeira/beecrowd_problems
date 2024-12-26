package beginner_iniciante;

import java.util.Scanner;

public class Main1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] nums = new float[6];
        int cont = 0;
        float soma=0, media;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextFloat();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                cont += 1;
                soma += nums[i];
            }
        }
        media = soma/cont;
        System.out.printf("%d valores positivos\n%.1f\n", cont, media);
    }
}