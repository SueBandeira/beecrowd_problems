package beginner_iniciante;

import java.util.Scanner;

public class Main1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, in=0, out=0;

        n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10 && nums[i] <= 20) 
                in += 1;
            else
                out += 1;
        }
        System.out.printf("%d in\n%d out\n", in, out);
    }
}