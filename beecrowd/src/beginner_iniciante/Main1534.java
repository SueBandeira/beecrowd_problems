package beginner_iniciante;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main1534 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int maxSize = 100;
    int[] input = new int[maxSize];
    int count = 0;

    while (true) {
      int n = sc.nextInt();
      if (n == 0) break;
      input[count++] = n;
    }
    sc.close();

    int[] inputArray = new int[count];
    System.arraycopy(input, 0, inputArray, 0, count);

    int[][][] matrizes = entrada(inputArray);

    for (int[][] matrix : matrizes) {
      System.out.println(formatMatrix(matrix));
    }
  }

  public static int[][][] entrada(int[] in) {
    int[][][] matrizes = new int[in.length][][];

    for (int k = 0; k < in.length; k++) {
      int n = in[k];
      int centralImpar = (n/2);
      int[][] mat = new int[n][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (i == j) {
            if (i==centralImpar && n % 2 != 0) mat[i][j] = 2;
            else mat[i][j] = 1;
          } else if (i == n - 1 - j) {
            mat[i][j] = 2;
          } else {
            mat[i][j] = 3;
          }
        }
      }
      matrizes[k] = mat;
    }
    return matrizes;
  }

  public static String formatMatrix(int[][] matrix) {
    StringBuilder sb = new StringBuilder();
    for (int[] row : matrix) {
      for (int j = 0; j < row.length; j++) {
        if (j == 0) {
          sb.append(String.format("%3d", row[j]));
        } else {
          sb.append(String.format(" %3d", row[j]));
        }
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}

class Main1534Test {
  @Test
  void solution() {
    int[] input = {4, 7};
    int[][][] result = Main1534.entrada(input);
    int[][] expected1 = {
        {1, 3, 3, 2},
        {3, 1, 2, 3},
        {3, 2, 1, 3},
        {2, 3, 3, 1}
    };
    int[][] expected2 = {
        {1, 3, 3, 3, 3, 3, 2},
        {3, 1, 3, 3, 3, 2, 3},
        {3, 3, 1, 3, 2, 3, 3},
        {3, 3, 3, 2, 3, 3, 3},
        {3, 3, 2, 3, 1, 3, 3},
        {3, 2, 3, 3, 3, 1, 3},
        {2, 3, 3, 3, 3, 3, 1}
    };

    Assertions.assertArrayEquals(expected1, result[0]);
    Assertions.assertArrayEquals(expected2, result[1]);
  }
}
