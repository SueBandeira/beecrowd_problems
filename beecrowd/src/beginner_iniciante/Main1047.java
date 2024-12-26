package beginner_iniciante;
import java.util.Arrays;
import java.util.Scanner;
public class Main1047 {
    public static int[] horario (int hInicio, int mInicio, int hFim, int mFim) {
        int delta = 0, alfa = 0;
        int[] v = new int[2];

        if (hInicio > hFim) {
            if(mInicio > mFim){
                alfa = 60;
                delta = 23;
            }else{
                delta = 24;
            }
        }else if (hFim > hInicio) { 
            //Inicio < fim
            if (hFim > hInicio && mInicio > mFim) {
                delta = -1;
                alfa = 60;
            }
        }else {
            //horas iguais
            if (hFim == hInicio && mInicio == mFim) {
                delta = 24;
            }
            if(hFim == hInicio && mInicio > mFim){
                delta = 23;
                alfa = 60;
            }
        }
        delta = delta + hFim - hInicio;
        alfa = alfa + mFim - mInicio;
        v[0] = delta;  
        v[1] = alfa;  
        return v;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] horarios = new int[4]; 
        int[] retorno;

        for (int i = 0; i < horarios.length; i++) {
            horarios[i] = sc.nextInt();
        }

        retorno = horario(horarios[0], horarios[1], horarios[2], horarios[3]);

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", retorno[0], retorno[1]);
    }
}
class Main1047Teste {
    public static void main(String[] args) {
        int[][] mat = {
            {10, 12, 10, 11}, {1, 1, 1, 1}, {1, 1, 1, 0}, {1, 1, 1, 2}, {1, 59, 2, 59},
            {10, 12, 12, 12}, {10, 12, 12, 13}, {11, 23, 10, 22}, {10, 12, 12, 10}, {11, 23, 10, 24},
            {11, 39, 19, 15}, {1, 59, 2, 58}, {10, 12, 10, 12}, {11, 23, 10, 23}, {0, 0, 0, 1},
            {7, 9, 6, 1}, {8, 10, 8, 9}, {0, 1, 0, 0}, {9, 10, 9, 9}, {10, 8, 11, 9}
        };
        int[][] vet = {
            {23, 59}, {24, 0}, {23, 59}, {0, 1}, {1, 0}, 
            {2, 0}, {2, 1}, {22, 59}, {1, 58}, {23, 1}, 
            {7, 36}, {0, 59}, {24, 0}, {23, 0}, {0, 1},
            {22, 52}, {23, 59}, {23, 59}, {23, 59}, {1, 1}
        };
        int[] got;
        for (int i = 0; i < vet.length; i++) {
            got = Main1047.horario(mat[i][0], mat[i][1], mat[i][2], mat[i][3]);
            if (got[0] != vet[i][0] || got[1] != vet[i][1]) {
                System.out.printf("Teste errado em %s, recebido [%d, %d], esperado [%d, %d].\n", 
                                  Arrays.toString(mat[i]), got[0], got[1], vet[i][0], vet[i][1]);
            }
        }
    }
}

