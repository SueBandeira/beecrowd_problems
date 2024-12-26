package beginner_iniciante;

import java.util.Scanner;

public class Main1038 {
  public static void main(String[] args) {
    int coder, amount;
    double price;
    try (Scanner sc = new Scanner(System.in)) {
      price = 0;
      coder = sc.nextInt();
      amount = sc.nextInt();
    }

    switch (coder) {
      case 1 -> price = amount * 4.0;
      case 2 -> price = amount * 4.50;
      case 3 -> price = amount * 5.0;
      case 4 -> price = amount * 2.0;
      case 5 -> price = amount * 1.50;
      default -> {
      }
    }
    System.out.printf("Total: R$ %.2f\n", price);
  }
}
