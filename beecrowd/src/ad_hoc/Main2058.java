package ad_hoc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main2058 {
  public static void main(String[] a) throws IOException {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    System.out.println(solution(m));
  }
  public static int solution(int n) {
    return n;
  }
}

class Main2058Test {
  static LinkedHashMap<Integer, Integer> tests = new LinkedHashMap<>();

  static {
    tests.put(1000000000, 999999998);
    tests.put(3, 1);
    tests.put(4, 2);
    tests.put(5, 3);
    tests.put(6, 4);
    tests.put(37, 35);
    tests.put(100, 98);
  }

  @Test
  void testSolution() {
    tests.forEach((k, v) -> Assertions.assertEquals(v, Main2058.solution(k)));
  }
}

