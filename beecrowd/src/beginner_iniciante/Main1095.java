package beginner_iniciante;

public class Main1095 {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 60; j >= 0; j=j-5) { 
            System.out.printf("I=%d J=%d\n", i, j);
            i = i+3;
        }
    }
}
