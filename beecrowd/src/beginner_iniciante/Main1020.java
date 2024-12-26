package beginner_iniciante;

import java.util.Scanner;

public class Main1020 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int d, m, a;

    d = sc.nextInt();
    sc.close();

    a = d/365;
    m = (d % 365)/30;
    d = (d % 365) % 30;

    System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", a, m, d);
  }
}
