/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad
 * que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
 * 0-0-0
 * 0-0-1
 * 0-0-2
 * 0-0-E
 * 0-0-4
 * 0-1-2
 * 0-1-E
 */
package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        String numCadena1;
        String numcadena2;
        String numcadena3;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    numCadena1 = String.valueOf(i);
                    numcadena2 = String.valueOf(j);
                    numcadena3 = String.valueOf(k);
                    numCadena1 = numCadena1.replace("3", "E");
                    numcadena2 = numcadena2.replace("3", "E");
                    numcadena3 = numcadena3.replace("3", "E");
                    System.out.println(numCadena1 + "-" + numcadena2 + "-" + numcadena3);
                }
            }
        }
    }
}
