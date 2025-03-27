//EJERCICIO 9, no entedí el FOR para sacar el factorial

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = consola.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            System.out.println("El factorial de " + numero + " es: " + factorial(numero));
        }

        consola.close();
    }

    // Función para calcular el factorial usando un bucle 'for'
    static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

 