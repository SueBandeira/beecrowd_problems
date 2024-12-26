package beginner_iniciante;

import java.util.Scanner;

public class Main1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, reajuste;
        int percentual;

        salario = sc.nextFloat();

        if(salario <= 400 && salario >= 0) {
            percentual = 15;
            reajuste = (salario*percentual)/100;
            salario += reajuste;
        }else if (salario <= 800) {
            percentual = 12;
            reajuste = (salario*percentual)/100;
            salario += reajuste;
        }else if (salario <= 1200) {
            percentual = 10;
            reajuste = (salario*percentual)/100;
            salario += reajuste;
        }else if (salario <= 2000) {
            percentual = 7;
            reajuste = (salario*percentual)/100;
            salario += reajuste;
        }else{
            percentual = 4;
            reajuste = (salario*percentual)/100;
            salario += reajuste;
        }
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%", salario, reajuste, percentual);
    }
}
