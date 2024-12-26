package beginner_iniciante;

import java.util.Scanner;

public class Main1012 {
  private static double areaTriangulo (double BASE, double ALTURA) {
    double area;

    area =  (BASE * ALTURA)/2;

    return area;
  }
  private static double areaCirculo (double raio) {
    double area;

    area =  3.14159 * Math.pow(raio, 2);

    return area;
  }
  private static double areaTrapezio (double baseA, double baseB, double altura) {
    double area;

    area =  ((baseA + baseB) * altura)/2;

    return area;
  }
  private static double areaQuadrado (double base) {
    return base * base;
  }
  private static double areaRetangulo (double baseA, double baseB) {
    return baseA * baseB;
  }
  public static void main(String[] args) {

    double A, B, C;
    try (Scanner sc = new Scanner (System.in)) {
      A = sc.nextDouble();
      B = sc.nextDouble();
      C = sc.nextDouble();
    }
    System.out.printf("TRIÂNGULO: %.3f\n",  areaTriangulo(A, C));
    System.out.printf("CIRCULO: %.3f\n",  areaCirculo(C));
    System.out.printf("TRAPEZIO: %.3f\n",  areaTrapezio(A, B, C));
    System.out.printf("QUADRADO: %.3f\n",  areaQuadrado(B));
    System.out.printf("RETANGULO: %.3f\n",  areaRetangulo(A, B));
  }
}
