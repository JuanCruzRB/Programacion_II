//EJERCICIO 6

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una calificación numérica del 1 al 10: ");
        int numero = consola.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido");
        } else {
            System.out.println("Calificación: " + obtenerDescripcion(numero));
        }

        consola.close(); // Cerramos el Scanner
    }

    static String obtenerDescripcion(int numero) {
        switch (numero) {
            case 1, 2, 3 -> { return "Insuficiente"; }
            case 4, 5 -> { return "Regular"; }
            case 6, 7 -> { return "Bueno"; }
            case 8, 9 -> { return "Muy Bueno"; }
            case 10 -> { return "Excelente"; }
            default -> { return "Número inválido"; } // Nunca debería ejecutarse
        }
    }
}

