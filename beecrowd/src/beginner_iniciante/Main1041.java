package beginner_iniciante;

import java.util.Scanner;

public class Main1041 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float x, y;
    x = sc.nextFloat();
    y = sc.nextFloat();

    if( x == 0 && y == 0)
      System.out.printf("Origem\n");
    else if(y == 0)
      System.out.printf("Eixo Y\n");
    else if(x == 0)
      System.out.printf("Eixo X\n");
    else if (x < 0)
      System.out.println(y < 0 ? "Q3" : "Q2");
    else if(x > 0)
      System.out.println(y > 0 ? "Q1" : "Q4");

  }
}
