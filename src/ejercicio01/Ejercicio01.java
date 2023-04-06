/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos,
 * el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos que desea convertir");
        int minutos = sc.nextInt();
        int horas = 0;
        int dias = 0;
        while (minutos >= 1440) {
            minutos -= 1440;
            dias++;
        }
        while (minutos >= 60) {
            minutos -= 60;
            horas++;
        }
        System.out.println("Los minutos ingresados equivalen a: " + dias + " dias, " + horas + " horas y " + minutos + " minutos");
    }
}
