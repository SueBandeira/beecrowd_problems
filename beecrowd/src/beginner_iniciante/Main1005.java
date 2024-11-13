package beginner_iniciante;

import java.util.Scanner;

public class Main1005 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A=sc.nextDouble(), B= sc.nextDouble(), MEDIA;

    MEDIA = ((A * 3.5) + (B * 7.5))/(11);

    System.out.printf("MEDIA = %.5f\n", MEDIA);
  }
}
