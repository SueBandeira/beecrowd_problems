package beginner_iniciante;

import java.util.Scanner;

public class Main1015 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    //sc.useLocale(Locale.US);
    double[][] matriz = new double[2][2];
    double distancia;

    for(int i = 0; i < matriz.length; i++) {
      for(int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = sc.nextDouble();
      }
    }
    sc.close();

    distancia = Math.sqrt(Math.pow((matriz[1][0] - matriz[0][0]), 2) + Math.pow((matriz[1][1] - matriz[0][1]), 2));

    System.out.printf("%.4f\n", distancia);
    System.exit(0);
  }
}
