package beginner_iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        List<Integer> num = new ArrayList<>();

        if (m > n) {
            int aux = m;
            m = n;
            n = aux;
        } 
        for (int i = m+1; i < n; i++) {
            if(i % 5 == 2 || i % 5 == 3 ) {
                num.add(i);
            }
        }
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
}