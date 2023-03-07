import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div, x, y;
        try {
            System.out.print("Introduce el numerador: ");
            x=sc.nextInt();
            System.out.print("Introduce el denominador: ");
            y=sc.nextInt();
            div = x / y;
            System.out.println("Result is: " + div);

        } catch (ArithmeticException e) {
            System.err.println("Has intentado dividir por cero");
        } catch (Exception e) {
            System.err.println("Otro error producido: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
}
