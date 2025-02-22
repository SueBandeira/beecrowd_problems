package beginner_iniciante;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main1435 {

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

    int[][][] matrices = entrada(inputArray);

    for (int[][] matrix : matrices) {
      System.out.println(formatMatrix(matrix));
    }
  }

  public static int[][][] entrada(int[] in) {
    int[][][] matrices = new int[in.length][][];

    for (int k = 0; k < in.length; k++) {
      int n = in[k];
      int[][] mat = new int[n][n];
      int x = (n + 1) / 2;
      int a = 0, b = n - 1;

      for (int l = 1; l <= x; l++) {
        for (int i = a; i <= b; i++) {
          for (int j = a; j <= b; j++) {
            mat[i][j] = l;
          }
        }
        a++;
        b--;
      }
      matrices[k] = mat;
    }
    return matrices;
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

class Main1435Test {

  @Test
  void solution() {
    int[] input = {1, 2, 3, 4, 5};

    int[][][] result = Main1435.entrada(input);

    int[][] expected1 = {
        {1}
    };
    int[][] expected2 = {
        {1, 1},
        {1, 1}
    };
    int[][] expected3 = {
        {1, 1, 1},
        {1, 2, 1},
        {1, 1, 1}
    };
    int[][] expected4 = {
        {1, 1, 1, 1},
        {1, 2, 2, 1},
        {1, 2, 2, 1},
        {1, 1, 1, 1}
    };
    int[][] expected5 = {
        {1, 1, 1, 1, 1},
        {1, 2, 2, 2, 1},
        {1, 2, 3, 2, 1},
        {1, 2, 2, 2, 1},
        {1, 1, 1, 1, 1}
    };

    Assertions.assertArrayEquals(expected1, result[0]);
    Assertions.assertArrayEquals(expected2, result[1]);
    Assertions.assertArrayEquals(expected3, result[2]);
    Assertions.assertArrayEquals(expected4, result[3]);
    Assertions.assertArrayEquals(expected5, result[4]);
  }
}


