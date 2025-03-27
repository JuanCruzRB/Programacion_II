//EJERCICIO 8

import java.util.Scanner;

public class Ejercicio8 {

    // Función para consultar saldo
    static int consultar(int saldo) {
        return saldo;
    }

    // Función para depositar dinero
    static int depositar(int saldo, int monto) {
        if (monto > 0) {
            return saldo + monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
            return saldo;
        }
    }

    // Función para retirar dinero
    static int retirar(int saldo, int monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. No puedes retirar más de $" + saldo);
            return saldo;
        } else if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
            return saldo;
        } else {
            return saldo - monto;
        }
    }

    static void menu() {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial: $");
        int saldo = consola.nextInt();
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinero");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es de $" + consultar(saldo));
                    break;

                case 2:
                    System.out.print("Ingrese un monto a depositar: $");
                    int deposito = consola.nextInt();
                    saldo = depositar(saldo, deposito);
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    int retiro = consola.nextInt();
                    saldo = retirar(saldo, retiro);
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        consola.close();
    }

    public static void main(String[] args) {
        menu();
    }
}

