package beginner_iniciante;

import java.util.Scanner;

public class Main1009 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    double salario, vendas;

    sc.next();
    salario = sc.nextDouble();
    vendas = sc.nextDouble();
    sc.close();

    salario = (15.00 * vendas)/100.00 + salario;

    System.out.printf("TOTAL = %.2f\n", salario);
  }
}