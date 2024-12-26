package beginner_iniciante;

import java.util.Scanner;

public class Main1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[3];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }
        if("vertebrado".equals(words[0])) {
            if("ave".equals(words[1])) {
                if("carnivoro".equals(words[2])){
                    System.out.println("aguia");
                }else if ("onivoro".equals(words[2])){
                    System.out.println("pomba");
                }
            }else if("mamifero".equals(words[1])){
                if("herbivoro".equals(words[2])){
                    System.out.println("vaca");
                }else if ("onivoro".equals(words[2])){
                    System.out.println("homem");
                }
            }
        }else if("invertebrado".equals(words[0])) {
            if("inseto".equals(words[1])) {
                if("hematofago".equals(words[2])){
                    System.out.println("pulga");
                }else if ("herbivoro".equals(words[2])){
                    System.out.println("lagarta");
                }
            }else if("anelideo".equals(words[1])){
                if("hematofago".equals(words[2])){
                    System.out.println("sanguessuga");
                }else if ("onivoro".equals(words[2])){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
