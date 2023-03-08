package exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1.	Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner),
 * calcule A/B y muestre el resultado por pantalla.
 * Se deberán tratar de forma independiente las dos posibles excepciones,
 * InputMismatchException y ArithmeticException,
 * mostrando en cada caso un mensaje de error diferente en cada caso.
 */
public class Exercice1 {
    public static void main(String[] args) {
        int a, b, div;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Introduce el numerador: ");
            a = sc.nextInt();
            System.out.print("Introduce el denominador: ");
            b = sc.nextInt();
            div = a / b;
            System.out.println("Result is: " + div);
        } catch (InputMismatchException e) {
            System.err.println("Input mismatch - not a valid integer entered " + e.getMessage());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Divide por cero");
        }
    }
}
