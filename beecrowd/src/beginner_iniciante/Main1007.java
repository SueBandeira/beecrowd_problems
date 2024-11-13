package beginner_iniciante;

import java.util.Scanner;

public class Main1007 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), D=sc.nextInt(), DIFERENCA;

    DIFERENCA = (A * B - C * D);

    System.out.printf("DIFERENCA = %d\n", DIFERENCA);
  }
}
