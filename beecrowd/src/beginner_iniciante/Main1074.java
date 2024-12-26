package beginner_iniciante;

import java.util.Scanner;

public class Main1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0 && nums[i] % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            }else if (nums[i] < 0 && nums[i] % 2 == 0)
                System.out.println("EVEN NEGATIVE");
            else if (nums[i] > 0 && nums[i] % 2 != 0) {
                System.out.println("ODD POSITIVE");
            }else if (nums[i] < 0 && nums[i] % 2 != 0) 
                System.out.println("ODD NEGATIVE");
            if (nums[i] == 0)
                System.out.println("NULL");
        }
    }
}
