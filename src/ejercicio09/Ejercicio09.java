/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule
 * el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que
 * el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
 * Por ejemplo: 50 / 13:
 * 50 – 13 = 37     una resta realizada
 * 37 – 13 = 24     dos restas realizadas
 * 24 – 13 = 11     tres restas realizadas
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número que quiere divir");
        int num = sc.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor = sc.nextInt();
        int contador = 0;
        while (num >= divisor) {
            num -= divisor;
            contador++;
        }
        System.out.println("Dado que " + num + " es menor que " + divisor + ", entonces: el residuo es " + num + " y el cociente es " + contador);
    }
}
