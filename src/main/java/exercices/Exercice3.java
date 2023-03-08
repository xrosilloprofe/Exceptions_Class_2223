package exercices;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 3.
 * a.	Luego, haz una clase principal con main para hacer pruebas:
 *      instancia varios objetos Gato y utiliza sus setters,
 *      probando distintos valores (algunos válidos y otros incorrectos).
 *      Maneja las excepciones.
 * b.	En la clase main usa un ArrayList<Gato>.
 *      Luego, utilizando un bucle, pide al usuario que introduzca los datos de 5 gatos:
 *      utiliza un Scanner para pedir los datos, instancia el objeto y guárdalo en el ArrayList.
 *      Por último, imprime la información de los gatos.
 *      Maneja las posibles excepciones de modo que en el ArrayList solo almacenemos
 *      objetos Gato válidos y el bucle se repita hasta crear y almacenar correctamente 5 gatos.
 */

public class Exercice3 {
    public static void main(String[] args) {
        try{
//            Gato cat1 = new Gato("a",10);
//            Gato cat2 = new Gato("listo",-1);
            Gato cat3 = new Gato("anastasia",10);
//            cat3.setEdad(-1);
//            cat3.setNombre("an");
        } catch (GatoException e){
            System.err.println("Error gatuno: " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        List<Gato> cats = new ArrayList<>();
        String nom;
        int edad;
        try{
            for (int i = 0; i < 5; i++) {
                System.out.print("Introduzca nombre del gato: ");
                nom = sc.next();
                System.out.print("Introduzca la edad del gato: ");
                edad = sc.nextInt();
                cats.add(new Gato(nom,edad));
            }

            for (Gato gat:cats) {
                System.out.println(gat);
            }

        } catch(GatoException e) {
            System.err.println("Error gatuno: " + e.getMessage());
        } catch (InputMismatchException e){
            e.printStackTrace();
        }

    }
}
