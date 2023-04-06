/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
 * y el promedio de estaturas en general.
 */
package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas a medir");
        int cantidadPersonas = sc.nextInt();
        double promedioAltura = 0;
        double alturaPersona;
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingresa la altura de la persona en cm");
            alturaPersona = sc.nextFloat();
            promedioAltura += alturaPersona;
        }
        promedioAltura /= cantidadPersonas;
        System.out.println("El promedio de la altura de las personas es de " + promedioAltura + " cm");
    }
}
