package TrabajoPractico2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int Alumnos = 5;
        final int Materias = 4;
        double[][] notas = new double[Alumnos][Materias];
        double[] promedios = new double[Alumnos];

        //Cargamos las notas por alumno
        for (int i = 0; i < Alumnos; i++) {
            System.out.print("Ingrese el nota del alumno: "+(i+1)+": ");
            double suma = 0;
            for (int j = 0; j < Materias; j++) {
                notas[i][j] = scanner.nextDouble();
                suma += notas[i][j];
            }
            promedios[i] = suma / Alumnos;
        }

        //Encontrar alumno con mayor promedio
        int mejorAlumno = 0;
        double maxPromedio = promedios[0];
        for (int i = 1; i < Alumnos; i++) {
            if (promedios[i] > maxPromedio) {
                maxPromedio = promedios[i];
                mejorAlumno = i;
            }
        }

        System.out.println("El alumno con el mejor promedio es: " + (mejorAlumno + 1)+ " con promedio: " + maxPromedio);

        scanner.close();
    }
}

