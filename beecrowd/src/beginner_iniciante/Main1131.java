package beginner_iniciante;

import java.util.Scanner;

public class Main1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc=0, numInter, numGremio, cont=0;
        int[] nums = new int[3];

        while (opc != 2) { 
            numInter = sc.nextInt();
            numGremio = sc.nextInt();

            System.out.println("Novo grenal (1-sim 2-nao)");
            opc = sc.nextInt();
            cont += 1;

            if (numInter > numGremio) 
                nums[0] += 1;
            else if (numGremio > numInter) 
                nums[1] += 1;
            else
                nums[2] += 1;
        }

        System.out.printf("%d grenais\n", cont);
        System.out.printf("Inter:%d\n", nums[0]);
        System.out.printf("Gremio:%d\n", nums[1]);
        System.out.printf("Empates:%d\n", nums[2]);

        if (nums[0] > nums[1]) 
            System.out.println("Inter venceu mais");
        else if (nums[1] > nums[0])
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Nao houve vencedor");
    }
}
