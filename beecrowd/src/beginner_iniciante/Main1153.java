package beginner_iniciante;

import java.util.Scanner;

public class Main1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,sum=1;
        int[] fat = new int[n];

        while (i < n) {
            fat[i] = n-i;
            sum = sum * fat[i];
            i++;
        }
        System.out.println(sum);
    }
}
