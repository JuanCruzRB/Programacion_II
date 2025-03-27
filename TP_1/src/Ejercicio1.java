//EJERCICIO 1, con algunos cambios del que hizo Agos. Más que nada la división...para que no se pueda hacer por 0

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        menu(entrada);
        entrada.close(); // Cerramos el Scanner una vez finalizado el programa
    }

    //funciones del menú
    static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    static double dividir(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Not-a-Number como indicador de error
        }
        return (double) numero1 / numero2; // Conversión a double para precisión
    }

    static void menu(Scanner entrada) {
        int opcion;

        do {
            System.out.println("\n=== Menú de Operaciones ===");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("0- Salir");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                int numero1 = entrada.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int numero2 = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + sumar(numero1, numero2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + restar(numero1, numero2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicar(numero1, numero2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + dividir(numero1, numero2));
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}


