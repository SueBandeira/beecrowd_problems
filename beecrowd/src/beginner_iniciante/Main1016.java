package beginner_iniciante;

import java.util.Scanner;

public class Main1016 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int distancia, t = 0;

    distancia = sc.nextInt();

    sc.close();

    t = distancia * 2;

    System.out.printf("%d minutos\n", t);
    System.exit(0);
  }
}
