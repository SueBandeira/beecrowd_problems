package beginner_iniciante;

import java.util.Scanner;

public class Main1040 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float n1, n2, n3, n4, n5, media;

    n1 = sc.nextFloat();
    n2 = sc.nextFloat();
    n3 = sc.nextFloat();
    n4 = sc.nextFloat();
    sc.close();

    media = (n1*2 + n2*3 + n3*4 + n4*1)/10;

    if (media >= 7.0) {
      System.out.printf("Media: %.1f\n", media);
      System.out.println("Aluno aprovado.");
    }else if (media >= 5.0) {
      System.out.printf("Media: %.1f\nAluno em exame.\n", media);
      n5 = sc.nextFloat();
      media = (media+n5)/2;
      if(media >= 5.0)
        System.out.printf("Nota do exame: %.1f\nAluno aprovado.\n", n5);
      else
        System.out.printf("Nota do exame: %.1f\nAluno reprovado.\n", n5);
      System.out.printf("Media final: %.1f\n", media);
    }else
      System.out.printf("Media: %.1f\nAluno reprovado.\n", media);
  }
}
