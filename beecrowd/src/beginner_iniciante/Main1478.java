package beginner_iniciante;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main1478 {

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
      int[][] mat = new int[n][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          mat[i][j] = Math.abs(i - j) + 1;
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

class Main1478Test {

  @Test
  void solution() {
    int[] input = {1, 2, 3, 4, 5};

    int[][][] result = Main1478.entrada(input);

    int[][] expected1 = {
        {1}
    };
    int[][] expected2 = {
        {1, 2},
        {2, 1}
    };
    int[][] expected3 = {
        {1, 2, 3},
        {2, 1, 2},
        {3, 2, 1}
    };
    int[][] expected4 = {
        {1, 2, 3, 4},
        {2, 1, 2, 3},
        {3, 2, 1, 2},
        {4, 3, 2, 1}
    };
    int[][] expected5 = {
        {1, 2, 3, 4, 5},
        {2, 1, 2, 3, 4},
        {3, 2, 1, 2, 3},
        {4, 3, 2, 1, 2},
        {5, 4, 3, 2, 1}
    };

    Assertions.assertArrayEquals(expected1, result[0]);
    Assertions.assertArrayEquals(expected2, result[1]);
    Assertions.assertArrayEquals(expected3, result[2]);
    Assertions.assertArrayEquals(expected4, result[3]);
    Assertions.assertArrayEquals(expected5, result[4]);
  }
}
