package TrabajoPractico2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SEMANAS = 4;
        final int DIAS = 7;

        double[][] temperaturas = new double[SEMANAS][DIAS];

        //temperaturas
        for (int i = 0; i < SEMANAS; i++) {
            System.out.println("Semana " + (i + 1) + ":");
            for (int j = 0; j < DIAS; j++) {
                System.out.print("Temperatura del día " + (j + 1) + ": ");
                temperaturas[i][j] = scanner.nextDouble();
            }
        }

        //temperatura media x semana
        System.out.println("\nTemperatura media semanal:");
        double sumaTotal = 0;
        int totalDias = 0;
        for (int i = 0; i < SEMANAS; i++) {
            double sumaSemanal = 0;
            for (int j = 0; j < DIAS; j++) {
                sumaSemanal += temperaturas[i][j];
                sumaTotal += temperaturas[i][j];
                totalDias++;
            }
            System.out.println("Semana " + (i + 1) + ": " + (sumaSemanal / DIAS));
        }

        //temperatura media x mes
        double mediaMensual = sumaTotal / totalDias;
        System.out.println("\nTemperatura media del mes: " + mediaMensual);

        //día más caluroso y más frío
        double tempMax = temperaturas[0][0];
        double tempMin = temperaturas[0][0];
        int semanaMax = 0, diaMax = 0, semanaMin = 0, diaMin = 0;

        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                if (temperaturas[i][j] > tempMax) {
                    tempMax = temperaturas[i][j];
                    semanaMax = i;
                    diaMax = j;
                }
                if (temperaturas[i][j] < tempMin) {
                    tempMin = temperaturas[i][j];
                    semanaMin = i;
                    diaMin = j;
                }
            }
        }

        System.out.println("\nDía más caluroso: Semana " + (semanaMax + 1) + ", Día " + (diaMax + 1) + " (" + tempMax + "°C)");
        System.out.println("Día más frío: Semana " + (semanaMin + 1) + ", Día " + (diaMin + 1) + " (" + tempMin + "°C)");
    }
}
