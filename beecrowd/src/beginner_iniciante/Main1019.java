package beginner_iniciante;

import java.util.Scanner;

public class Main1019 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int s, m, h;

    s = sc.nextInt();
    sc.close();

    h = s/3600;
    m = (s % 3600)/60;
    s = s % 60;

    System.out.printf("%d:%d:%d\n", h, m, s);
  }
}
