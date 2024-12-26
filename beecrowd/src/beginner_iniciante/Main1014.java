package beginner_iniciante;

import java.util.Scanner;

public class Main1014 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

        /*        int kilo = sc.nextInt();
        double litro = sc.nextDouble();

        System.out.printf("%.3f km/l\n", kilo/litro); */

    double[] dados = new double[2];

    for(int i = 0; i < dados.length; i++) {
      dados[i] = sc.nextDouble();
      System.out.println(dados[i]);
    }
    sc.close();

    System.out.printf("%.3f km/l\n", dados[0]/dados[1]);
    System.exit(0);
  }
}