//EJERCICIO 11

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        final String CONTRASENA_CORRECTA = "progra2"; // Contraseña predefinida
        int intentos = 3;
        String ingreso;

        System.out.println("Bienvenido. Tienes " + intentos + " intentos para ingresar la contraseña correcta.");

        do {
            System.out.print("Ingrese la contraseña: ");
            ingreso = consola.nextLine();

            if (ingreso.equals(CONTRASENA_CORRECTA)) {
                System.out.println("¡Acceso concedido!");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Acceso denegado. Se agotaron los intentos.");
                }
            }
        } while (intentos > 0);

        consola.close();
    }
}
 