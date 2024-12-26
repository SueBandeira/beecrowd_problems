package beginner_iniciante;

import java.util.Scanner;

public class Main1011 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    double vol, pi = 3.14159;

    vol = (4/3.0) * pi * Math.pow(sc.nextDouble(), 3);
    sc.close();
    System.out.printf("VOLUME = %.3f\n", vol);
  }
}
