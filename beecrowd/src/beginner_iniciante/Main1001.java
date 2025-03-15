package beginner_iniciante;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;

public class Main1001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A= sc.nextInt(), B= sc.nextInt(), X;

    X = soma(A, B);

    System.out.printf("X = %d\n", X);
  }
  public static int soma(int a, int b) {
    return a + b;
  }
}

class Main1001Test {
  @Test
  void solution() {
    int[][] input = {
        {10, 9},
        {-10, 4},
        {15, -7}
    };

    int[] expected = {19, -6, 8};

    for (int i = 0; i < input.length; i++) {
      int result = Main1001.soma(input[i][0], input[i][1]);
      assertEquals(expected[i], result,
          "Erro na soma de " + input[i][0] + " + " + input[i][1]);
    }
  }
}
