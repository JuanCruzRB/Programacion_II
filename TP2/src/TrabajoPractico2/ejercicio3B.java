package TrabajoPractico2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>();

        System.out.println("Ingrese los títulos de los libros (ingrse FIN para terminar): ");
        while (true) {
            String libro = scanner.nextLine();
            if (libro.equalsIgnoreCase("FIN")) {
                break;
            }
            libros.add(libro);
        }

        System.out.println("Ingrese el título o parte del título del libro a buscar: ");
        String consulta = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).toLowerCase().contains(consulta)) {
                System.out.println("Libro encontrado: "+ libros.get(i) + " en la posición "+ i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El libro no fue encontrado");
        }

        scanner.close();
    }
}