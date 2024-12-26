package beginner_iniciante;

import java.util.Scanner;

public class Main1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linha;
        while (sc.hasNext()) { 
            linha = sc.nextLine();
            if (!linha.equals("0 0"))
                System.out.println(Solution(linha));
            else
                break;
        }
    }
    public static String Solution (String line) {
       String[]  corte1 = line.split(" ");
       String result, strLong;
       int index=0;

        //boolean found = false;
        corte1[1] = corte1[1].replaceAll(corte1[0], "");
        for (; index < corte1[1].length(); index++) {
            if (corte1[1].charAt(index) != '0') {
                break;
            }
        }
        if(index == corte1[1].length()) {
            result = "0";
        } else {
            strLong = corte1[1].length() < 1 ? 0 + corte1[1] : corte1[1].substring(index);
            result = strLong;
        }
       
       return result;
    }
}