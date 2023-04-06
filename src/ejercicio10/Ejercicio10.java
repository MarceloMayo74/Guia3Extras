/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados
 * aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que
 * la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio
 * investigue como utilizar la función Math.random() de Java.
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, n, nn;
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        nn = num1 * num2;
        do {
            System.out.println("Ingrese un número para adivinar la multiplicación de dos números entre 0 y 10");
            n = sc.nextInt();
            if (n > nn) {
                System.out.println("El número es más chico");
            } else if (n < nn) {
                System.out.println("El número es más grande");
            }
        } while (n != nn);
        System.out.println("Adivinaste el número!");
    }
}
