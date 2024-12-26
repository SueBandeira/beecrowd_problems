package beginner_iniciante;

import java.util.Scanner;

public class Main1035 {

  public static void main(String[] args) {
    boolean[] operacoes;
    int[] valores;
    try (Scanner sc = new Scanner (System.in)) {
      operacoes = new boolean[5];
      valores = new int[4];
      for (int i = 0; i < valores.length; i++) {
        valores[i] = sc.nextInt();
      }
    }
    boolean flag = true;
    //Mais otimizado, fazer para os demais
    //flag = flag && valores[1] > valores[2];
    operacoes[0] = valores[1] > valores[2];
    operacoes[1] = valores[3] > valores[0];
    operacoes[2] = valores[2] + valores[3] > valores[0] + valores[1];
    operacoes[3] = valores[2] > 0 && valores[3] > 0;
    operacoes[4] = valores[0] % 2 == 0;


    for (int i = 0; i < operacoes.length; i++) {
      flag = operacoes[i] && flag;
    }

    String msg = flag ? "Valores aceitos" : "Valores nao aceitos";
    System.out.println(msg);
    System.exit(0);
  }
}