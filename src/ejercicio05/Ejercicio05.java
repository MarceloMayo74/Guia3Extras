/*
 * Una obra social tiene tres clases de socios:
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
 * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
 * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 * Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del
 * tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Clase de Socio (A,B o C)");
        String opcion = sc.next();
        opcion = opcion.toUpperCase();
        System.out.println("Ingrese el valor del tratamiento");
        double importe = sc.nextInt();
        double descuento;
        switch (opcion) {
            case "A" -> {
                descuento = importe * 0.5;
                System.out.println("El socio clase A abonara el 50% del tratamiento " + descuento);
            }
            case "B" -> {
                descuento = importe * 0.65;
                System.out.println("El socio clase B abonara el 65% del tratamiento " + descuento);
            }
            case "C" -> {
                System.out.println("El socio clase C abonara el 100% del tratamiento " + importe);
            }
        }
    }
}
