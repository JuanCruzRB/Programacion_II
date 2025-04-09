package TrabajoPractico2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();
        System.out.println("Ingrese la cantidad de depósitos: ");
        int m = scanner.nextInt();

        int[][] stock = new int[n][m];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto "+ (i+1)+": ");
            for (int j = 0; j < m; j++) {
                System.out.println(" Ingrese cantidad en depósito: "+ (j+1)+": ");
                stock[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nStock total por producto: ");
        for (int i = 0; i < n; i++) {
            int totalProductos = 0;
            for (int j = 0; j < m; j++) {
                totalProductos += stock[i][j];
            }
            System.out.println("\nProducto "+ (i+1)+": "+totalProductos);
        }

        int depositoMax = 0;
        int maxStock = 0;

        for (int j = 0; j < m; j++) {
            int totalDeposito = 0;
            for (int i = 0; i < n; i++) {
                totalDeposito += stock[i][j];
            }

            if (totalDeposito > maxStock) {
                maxStock = totalDeposito;
                depositoMax = j;
            }
        }

        System.out.println("\nEl deposito con más productos acumulados es: "+ (depositoMax + 1)+ " con "+ maxStock + " unidades.");
    }
}
 