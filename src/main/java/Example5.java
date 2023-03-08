import java.io.File;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int div, x, y;
        int v[] = {1, 2, 3};

        try {
            System.out.print("Introduce el numerador: ");
            x = sc.nextInt();
            System.out.print("Introduce el denominador: ");
            y = sc.nextInt();
            div = x / y;
            System.out.println("Result is: " + div);

            System.out.print("Introduce la posición del vector a consultar: ");
            int elem = sc.nextInt();
            System.out.println("Element is: " + v[elem]);

        } catch (ArithmeticException ea) {
            System.err.println("Has intentado dividir por cero " + ea);
        } catch (ArrayIndexOutOfBoundsException ei) {
            System.err.println("La posición del vector no existe " + ei);
        } catch (Exception e) {
            System.err.println("Otro error producido: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
}
