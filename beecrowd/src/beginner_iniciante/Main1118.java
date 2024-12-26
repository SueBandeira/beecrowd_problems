package beginner_iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> num = new ArrayList<>();
        int cont = 0, opc =0;
        double b, a, c;

        while (cont < 2) {
            a = sc.nextDouble();
           
            if (a < 0 || a > 10.0) {
                System.out.println("nota invalida");
            } else {
                num.add(a);
                cont += 1;
            }
            if (cont == 2) {
                b = num.get(1);
                    System.out.printf("media = %.2f\n", (num.get(0)+b)/2);
                opc = 0;
                while (opc != 1 && opc != 2) {
                    System.out.printf("novo calculo (1-sim 2-nao)\n");
                    opc = sc.nextInt();
                    if (opc == 1) {
                        cont = 0;
                        num.clear();
                    } else if (opc == 2) {
                        break;
                    }
                }
            }
        }
    }
}
// -3,5
// 3,5
// 11,0
// 10,0
// 4
// 1
// 8,0
// 9,0
// 2