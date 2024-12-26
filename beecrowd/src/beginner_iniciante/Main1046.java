package beginner_iniciante;

import java.util.Scanner;

public class Main1046 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inicio, fim, delta = 0;

    inicio = sc.nextInt();
    fim = sc.nextInt();

    if(fim <= inicio) delta = 24;
      System.out.printf("O JOGO DUROU %d HORA(S)\n", delta-inicio+fim);
  }
}
