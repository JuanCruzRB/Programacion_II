//EJERCICIO 14
import java.util.Scanner;

public class Ejercicio14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int suma = 0, contador = 0;
            int nota;

            System.out.println("Ingrese las notas (use -1 para finalizar):");
            while (true) {
                nota = scanner.nextInt();
                if (nota == -1) break;
                suma += nota;
                contador++;
            }

            if (contador > 0) {
                double promedio = (double) suma / contador;
                System.out.println("Promedio: " + promedio);
                if (promedio >= 6) {
                    System.out.println("¡Aprobado!");
                } else {
                    System.out.println("Desaprobado.");
                }
            } else {
                System.out.println("No se ingresaron notas válidas.");
            }
            scanner.close();
        }
}
