package beginner_iniciante;

import java.util.Scanner;

public class Main1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, imposto=0;
        salario = sc.nextFloat();
        if (salario >= 0 && salario <= 2000) 
            System.out.println("Isento");
        else {
            salario = salario - 2000;
            if(salario > 1000){
                imposto = (1000*8) / 100;
                salario = salario - 1000;
            }
            else {
                imposto = (salario*8) / 100;
                salario = 0;
            }
            if(salario > 0) {
                if (salario > 1500){
                    imposto += ((1500*18) / 100);
                    salario = salario - 1500;
                }
                else{
                    imposto += ((salario*18) / 100);
                    salario = 0;
                }
                if (salario > 0)
                    imposto += (salario*28) / 100;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}