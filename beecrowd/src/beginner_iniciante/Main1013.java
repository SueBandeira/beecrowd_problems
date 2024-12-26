package beginner_iniciante;

import java.util.Scanner;

public class Main1013 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int[] num = new int[3];
    int i, maior = 0;

    for(i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
      if(i >= num.length)
        sc.close();
    }

    for(i = 0; i < num.length; i++) {
      maior = (maior + num[i] + Math.abs(maior - num[i]))/2;
    }

    System.out.printf("%d eh o maior\n", maior);
    System.exit(0);
  }
}
