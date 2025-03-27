//EJERCICIO 2

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        entrada.close(); // Cerramos el Scanner
    }

    static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false; // Los números menores que 2 no son primos
        }
        for (int i = 2; i * i <= numero; i++) { // Recorremos hasta la raíz cuadrada de numero
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
