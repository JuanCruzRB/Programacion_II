package TrabajoPractico2;

import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        final int N = 3; //tamaño
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] suma = new int[N][N];
        int[][] resta = new int[N][N];

        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt(10) + 1;
                B[i][j] = rand.nextInt(10) + 1;
                suma[i][j] = A[i][j] + B[i][j];
                resta[i][j] = A[i][j] - B[i][j];
            }
        }

        //mostrar matrices
        System.out.println("Matriz A:");
        mostrarMatriz(A);
        System.out.println("\nMatriz B:");
        mostrarMatriz(B);
        System.out.println("\nSuma A + B:");
        mostrarMatriz(suma);
        System.out.println("\nResta A - B:");
        mostrarMatriz(resta);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
