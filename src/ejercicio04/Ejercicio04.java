/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int num = sc.nextInt();
        if (num > 0 && num < 11) {
            if (num == 1) {
                System.out.println("El numero ingresado es I en numeros romanos");
            }
            if (num == 2) {
                System.out.println("El numero ingresado es II en numeros romanos");
            }
            if (num == 3) {
                System.out.println("El numero ingresado es III en numeros romanos");
            }
            if (num == 4) {
                System.out.println("El numero ingresado es IV en numeros romanos");
            }
            if (num == 5) {
                System.out.println("El numero ingresado es V en numeros romanos");
            }
            if (num == 6) {
                System.out.println("El numero ingresado es VI en numeros romanos");
            }
            if (num == 7) {
                System.out.println("El numero ingresado es VII en numeros romanos");
            }
            if (num == 8) {
                System.out.println("El numero ingresado es VIII en numeros romanos");
            }
            if (num == 9) {
                System.out.println("El numero ingresado es IX en numeros romanos");
            }
            if (num == 10) {
                System.out.println("El numero ingresado es X en numeros romanos");
            }
        } else {
            System.out.println("Numero ingresado es incorrecto");
        }
    }
}
