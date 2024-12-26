package beginner_iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Main1036 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double[] valores;
    double delta, x1, x2;

    try (Scanner sc = new Scanner (System.in)) {
      valores = new double[3];
      x1 = 0;
      x2 = 0;
      for (int i = 0; i < valores.length; i++) {
        valores[i] = sc.nextDouble();
      }
    }

    delta = Math.pow(valores[1], 2) - (4 * valores[0] * valores[2]);

    if(valores[0] == 0 || delta < 0)
      System.out.println("Impossivel calcular");
    else {
      if(delta >= 0)
        x1 = (- valores[1] + Math.sqrt(delta)) / (2 * valores[0]);
      else
        x2 = (- valores[1] - Math.sqrt(delta)) / (2 * valores[0]);
      System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
    }

    System.exit(0);
  }
}

