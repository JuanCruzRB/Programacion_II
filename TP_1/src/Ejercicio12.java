import java.util.Scanner;

public class Ejercicio12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una palabra: ");
            String palabra = scanner.nextLine().toLowerCase();

            int vocales = 0;
            int consonantes = 0;

            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.charAt(i);
                if (Character.isLetter(c)) {
                    if ("aeiou".indexOf(c) != -1) {
                        vocales++;
                    } else {
                        consonantes++;
                    }
                }
            }

            System.out.println("Cantidad de vocales: " + vocales);
            System.out.println("Cantidad de consonantes: " + consonantes);
            scanner.close();
        }
}
