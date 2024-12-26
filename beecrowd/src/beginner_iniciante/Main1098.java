package beginner_iniciante;

public class Main1098 {
    public static void main(String[] args) {
        double somaI = 0,  i, j;
        for (i = 0; i <= 2; i=i+0.2) {
            for (j = 1; j <= 3; j++) { 
                if(i == 0 || i == 1 || j+i == 3|| j+i == 4 || j+i == 5)
                    System.out.printf("I=%.0f J=%.0f\n", i, j+i);
                else
                    System.out.printf("I=%.1f J=%.1f\n", i, j+i);
            }
            somaI += 0.2;
        }
    }
}