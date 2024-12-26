package beginner_iniciante;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String diaInicial, diaFinal, hInicial, hFim, num1, num2;
        int numero1 =0, numero2=0;
        
        diaInicial = sc.nextLine();
        hInicial = sc.nextLine();
        diaFinal = sc.nextLine();
        hFim = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher dini = pattern.matcher(diaInicial);
        Matcher dfim = pattern.matcher(diaFinal);
        Matcher hini = pattern.matcher(hInicial);
        Matcher hfim = pattern.matcher(hFim);

        int[] horaInicial = new int[3], horaFinal = new int[3];
        int index = 0, q1, q2;

        while (hini.find() && hfim.find()) {
            String numeroStr = hini.group();
            String numeroStr2 = hfim.group();
            horaInicial[index] = Integer.parseInt(numeroStr);
            horaFinal[index] = Integer.parseInt(numeroStr2);
            index++;
        }
        if (dini.find() && dfim.find()) {
            num1 = dini.group();
            num2 = dfim.group();
            numero1 = Integer.parseInt(num1);
            numero2 = Integer.parseInt(num2);
            
            int sub = numero2 - numero1;
            System.out.println("Número subtraido: " + sub);
        }
        q1= horaInicial[2] + horaInicial[1] * 60 + horaInicial[0] * 3600 + numero1 *86400;
        q2= horaFinal[2] + horaFinal[1] * 60 + horaFinal[0] * 3600 + numero2 *86400;
        int tempo = q2 - q1;

        System.out.printf("%d dia(s)\n", tempo/86400);
        tempo = tempo % 86400;
        System.out.printf("%d hora(s)\n", tempo/3600);
        tempo = tempo % 3600;
        System.out.printf("%d minuto(s)\n", tempo/60);
        tempo = tempo % 60;
        System.out.printf("%d segundo(s)\n", tempo);
    }
}
