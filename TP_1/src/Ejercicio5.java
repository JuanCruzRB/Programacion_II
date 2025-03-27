//EJERCICIO 5

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        // Validamos que el número sea positivo
        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = entrada.nextInt();
            if (numero <= 0) {
                System.out.println("Error: El número debe ser mayor que 0.");
            }
        } while (numero <= 0);

        int sumaPares = calcularSumaPares(numero);
        int sumaImpares = calcularSumaImpares(numero);

        System.out.println("La suma de los números pares hasta " + numero + " es: " + sumaPares);
        System.out.println("La suma de los números impares hasta " + numero + " es: " + sumaImpares);

        entrada.close(); // Cerramos el Scanner
    }
    static int calcularSumaPares(int N) {
        int suma = 0;
        for (int i = 2; i <= N; i += 2) { // Recorre solo los pares
            suma += i;
        }
        return suma;
    }

    static int calcularSumaImpares(int N) {
        int suma = 0;
        for (int i = 1; i <= N; i += 2) { // Recorre solo los impares
            suma += i;
        }
        return suma;
    }
}
