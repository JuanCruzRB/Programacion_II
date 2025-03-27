//EJERCICIO 3

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = consola.nextInt(); // Ingreso del número

        System.out.println("\nTabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        consola.close(); // Cerramos el Scanner
    }
}

