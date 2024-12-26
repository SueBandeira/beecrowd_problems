package beginner_iniciante;

import java.util.Scanner;

public class Main1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1=0, num2=0;
        int[] somaImpar = new int[n];

        for (int i = 0; i < n; i++) {
            num1 = sc.nextInt(); 
            num2 = sc.nextInt();
            System.out.printf("%d | %d\n", num1, num2);

            if(num1 != num2 && num1 < num2)
                for (int j = num1+1; j < num2; j++) {
                    if(j % 2 != 0){
                        somaImpar[i] += j;
                    }
                }
            else if (num1 != num2 && num1 > num2)
                for (int j = num1-1; j > num2; j--) {
                    if(j % 2 != 0){
                        somaImpar[i] += j;
                    }
                }
            else 
                somaImpar[i] = 0;
        }
        for (int i = 0; i < somaImpar.length; i++) {
            System.out.println(somaImpar[i]);
        }
    }
}
