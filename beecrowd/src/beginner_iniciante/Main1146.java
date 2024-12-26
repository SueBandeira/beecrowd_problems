package beginner_iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j=0;
        String a;
        List<String> b = new ArrayList<>();

        while ((n=sc.nextInt()) != 0) {
            for (i = 1; i <= n; i++) {
                a = String.format("%d", i);
                b.add(a);  
                if(i == n)
                    System.out.println(String.join(" ", b));    
            }
            b.clear();
        }
    }
}