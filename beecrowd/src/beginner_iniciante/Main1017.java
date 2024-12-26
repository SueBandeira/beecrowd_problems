package beginner_iniciante;

import java.util.Scanner;

public class Main1017 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int distancia, t = 0, Vm = 0;
    double litros;

    t = sc.nextInt();
    Vm = sc.nextInt();
    sc.close();

    distancia = Vm * t;

    litros = distancia/12.0;

    System.out.printf("%.3f\n", litros);
    System.exit(0);
  }
}
