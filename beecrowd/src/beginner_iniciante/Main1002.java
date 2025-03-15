package beginner_iniciante;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import java.util.Scanner;


public class Main1002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A, R=sc.nextDouble();

    A = area(R);

    System.out.printf("A=%.4f\n", A);
  }

  public static double area(double raio) {
    //return Math.PI * Math.pow(raio, 2); PI com mais casas decimais, usar o valor 3,14159 como explicitado no problema
    return 3.14159 * Math.pow(raio, 2);
  }
}
class Main1002Test {
  @Test
  void solution() {
    Map<Double, Double> expectedValues = Map.of(
        2.0, 12.5664,
        100.64, 31819.3103,
        150.00, 70685.7750
    );

    for (Map.Entry<Double, Double> entry : expectedValues.entrySet()) {
      double result = Main1002.area(entry.getKey());
      assertEquals(entry.getValue(), result, 0.0001,
          "Erro na área do círculo de raio " + entry.getKey());
    }
  }
}
