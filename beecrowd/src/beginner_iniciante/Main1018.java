package beginner_iniciante;

import java.util.Scanner;

public class Main1018 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int[] notas = {100, 50, 20, 10, 5, 2, 1}, a = new int[7];
    int num;

    num = sc.nextInt();
    sc.close();

    System.out.printf("%d\n", num);

    for (int i= 0; i < notas.length; i++) {
      a[i] = num / notas[i];
      num =  num % notas[i];
    }

    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d nota(s) de R$ %d,00\n", a[i], notas[i]);
    }

    System.exit(0);
  }
}
