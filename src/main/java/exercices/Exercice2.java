package exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2.	Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un bucle,
 * pida cinco valores por teclado y los introduzca en el vector.
 * Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta rellenar
 * completamente el vector.
 */

public class Exercice2 {
    public static void main(String[] args) {
        double[] vector = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter next value: ");
            try {
                vector[i] = sc.nextDouble();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                sc.nextLine();
                i--;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }


}
