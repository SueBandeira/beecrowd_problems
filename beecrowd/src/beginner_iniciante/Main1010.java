package beginner_iniciante;

import java.util.Scanner;

public class Main1010 {
  public static void main(String[] args) {
    double valor;
    try (Scanner sc = new Scanner (System.in)) {
      double [][] dados =
          {
              {0, 0, 0},
              {0, 0, 0}
          };  valor = 0;
      for (int i = 0; i < dados.length; i++) {
        for(int j = 0; j < dados[i].length; j++){
          dados[i][j] = sc.nextDouble();
        }
        valor += (dados[i][1] * dados[i][2]);
      }
    }
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);

  }
}