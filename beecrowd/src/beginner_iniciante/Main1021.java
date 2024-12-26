package beginner_iniciante;

import java.util.Scanner;

public class Main1021 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] notas = {100, 50, 20, 10, 5, 2}, a = new int[6];
    int[] moedas = {100, 50, 25, 10, 5, 1}, b = new int[6];
    double num;
    int aux, num2;

    num = sc.nextDouble();
    sc.close();
    aux = (int) num;
    num2 = (int) (num * 100) % 100;

    for (int i = 0; i < notas.length; i++) {
      a[i] = aux / notas[i];
      aux = aux % notas[i];
      b[i] = num2 / moedas[i];
      num2 = num2 % moedas[i];
    }
    b[0] = aux;

    System.out.println("NOTAS:");
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d nota(s) de R$ %d.00\n", a[i], notas[i]);
    }
    System.out.println("MOEDAS:");
    for (int i = 0; i < b.length; i++) {
      System.out.printf("%d moeda(s) de R$ %.2f\n", b[i], (double) moedas[i] / 100);
    }

    System.exit(0);
  }
}
