package beginner_iniciante;

public class Main1097 {
    public static void main(String[] args) {
        int inicio = 7, fim = 5, i, j;
        for ( i = 1; i < 10; i=i+2) {
            for ( j = inicio; j >= fim; j--) { 
                System.out.printf("I=%d J=%d\n", i, j);
            }
            inicio += 2;
            fim += 2;
        }
    }
}