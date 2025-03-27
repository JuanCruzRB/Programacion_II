//EJERCICIO 4

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        // Validamos que el número sea positivo
        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = entrada.nextInt();
            if (numero < 0) {
                System.out.println("Error: El número debe ser positivo.");
            }
        } while (numero < 0);

        int contador = contarDigitos(numero);

        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");

        entrada.close(); // Cerramos el Scanner
    }

    static int contarDigitos(int numero) {
        int contador = 0;
        do {
            contador++;
            numero /= 10; // Elimina el último dígito
        } while (numero > 0);
        return contador;
    }
}

