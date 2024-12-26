package beginner_iniciante;

import java.util.Scanner;

public class Main1037 {
  public static void main(String[] args) {
    double valor;
    try (Scanner sc = new Scanner (System.in)) {
      valor = sc.nextDouble();
    }
    //([0,25], (25,50], (50,75], (75,100])
    if (valor >= 0 && valor <=25) {
      System.out.println("Intervalo [0,25]\n");
    }else if (valor > 25 && valor <= 50) {
      System.out.println("Intervalo (25,50]\n");
    }else if (valor > 50 && valor <= 75) {
      System.out.println("Intervalo (50,75]\n");
    }else if (valor > 75 && valor <= 100) {
      System.out.println("Intervalo (75,100]\n");
    }else{
      System.out.println("Fora de intervalo\n");
    }
  }
}