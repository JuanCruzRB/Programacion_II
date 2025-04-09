package TrabajoPractico2;

import java.util.Scanner;

public class ejercicio3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] libros = {
                "El señor de los anillos", "Cien años de soledad", "Crónica de una muerte anunciada", "Harry Potter y la piedra filosofal", "Orgullo y prejuicio", "La vuelta al mundo en 80 días", "Don Quijote de la Mancha", "El código Da Vinci", "La sombra del viento", "1984"
        };

        System.out.println("Ingrese el título o parte del título del libro a buscar: ");
        String consulta = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].toLowerCase().contains(consulta)) {
                System.out.println("Libro encontrado: "+ libros[i]+ " en la posición "+ i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El libro no se encuentra");
        }

        scanner.close();
    }
}