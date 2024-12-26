package beginner_iniciante;

import java.util.Scanner;

public class Main1044 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, num1;

    num = sc.nextInt();
    num1 = sc.nextInt();

    if (num % num1 == 0 || num1 % num == 0) {
      System.out.printf("Sao multiplos\n");
    }else
      System.out.printf("Nao sao multiplos\n");
  }
}

