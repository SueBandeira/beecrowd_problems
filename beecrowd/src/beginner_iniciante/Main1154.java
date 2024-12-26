package beginner_iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        double media=0;
        List<Integer> sum = new ArrayList<>();

        while ((n=sc.nextInt()) >= 0 ) {
            sum.add(n);
        }
        for (int i = 0; i < sum.size(); i++) {
            media += sum.get(i);
        }
       
        System.out.printf("%.2f\n",  media/sum.size());
    }
}
