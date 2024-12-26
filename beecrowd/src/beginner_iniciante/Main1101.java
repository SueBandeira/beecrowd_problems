package beginner_iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 1, n= 1;
        List<Integer> numeros = new ArrayList<>();
        int i=0, total=0, aux=0;
       
        while ((m = sc.nextInt()) > 0 && (n = sc.nextInt()) > 0) {
             
            if(m > n && m != 0 && n !=0) {
                aux = m;
                m = n;
                n = aux;
            }else {
                m += 0;
                n += 0;
            }

            if(m != 0 &&  n != 0) {
                for (int j = m; j <= n; j++) {
                        numeros.add(j);
                        total += j;
                }
                for (int j = 0; j < numeros.size(); j++) {
                    System.out.printf("%d ", numeros.get(j));
                }
                System.out.printf(" Sum=%d\n", total);
            }
            numeros.clear();
            total = 0;
        }
    }
}