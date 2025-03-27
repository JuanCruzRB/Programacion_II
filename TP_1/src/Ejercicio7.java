//EJERCICIO 7

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        int intento;

        System.out.println("¡Bienvenido al juego del número secreto!");
        System.out.println("Intentá adivinar un número entre 1 y 100.");

        do {
            System.out.print("Ingrese su número: ");
            intento = entrada.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número secreto.");
            }

        } while (intento != numeroSecreto);

        entrada.close(); // Cerramos el Scanner
    }
}
 