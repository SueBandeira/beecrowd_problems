package beginner_iniciante;

import java.util.Scanner;

public class Main1006 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A=sc.nextDouble(), B=sc.nextDouble(), C=sc.nextDouble(), MEDIA;

    MEDIA = (A*2 + B*3 + C*5)/10;

    System.out.printf("MEDIA = %.1f\n", MEDIA);
  }
}
