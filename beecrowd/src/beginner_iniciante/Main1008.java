package beginner_iniciante;

import java.util.Scanner;

public class Main1008 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int func, horas;
    double valorH, salario;

    func = sc.nextInt();
    horas = sc.nextInt();
    valorH = sc.nextDouble();

    salario = (horas * valorH);

    System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", func, salario);
  }
}
