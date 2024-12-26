package beginner_iniciante;

import java.util.Scanner;

public class Main1043 {
  public static boolean triangulo(float a, float b, float c) {
    return (a + b > c && b + c > a && c + a > b);
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    float A, B, C, p, a;

    A = s.nextFloat();
    B = s.nextFloat();
    C = s.nextFloat();

    if(triangulo(A, B, C)) {
      p = A + B + C;
      System.out.printf("Perimetro = %.1f\n", p);
    }else {
      a = ((A + B)*C)/2;
      System.out.printf("Area = %.1f\n", a);
    }

  }
}