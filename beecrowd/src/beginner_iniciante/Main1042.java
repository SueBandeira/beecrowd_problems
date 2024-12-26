package beginner_iniciante;

import java.util.Scanner;

public class Main1042 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[3], num2 = new int[3];
    int maior = -999, menor = 999;

    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }
    for (int i = 0; i < num.length; i++) {
      if (num[i] > maior) {
        maior = num[i];
        num2[2] = maior;
      }
      if (num[i] < menor){
        menor = num[i];
        num2[0] = menor;
      }
    }
    for (int i = 0; i < num.length; i++) {
      if(num[i] != num2[0] && num[i] != num2[2])
        num2[1] = num[i];
    }
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%d\n", num2[i]);
    }
    System.out.println();
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%d\n", num[i]);
    }
  }
}
