package beginner_iniciante;

import java.util.Scanner;

public class Main1002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A, R=sc.nextDouble();

    A =  Math.PI * Math.pow(R, R);

    System.out.printf("A=%.4f\n", A);
  }
}
