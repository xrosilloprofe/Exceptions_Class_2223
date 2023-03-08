package moreexamples;

public class Example3 {
    public static void main(String[] args) {
        int[] numeros = new int[]{1,2,3,5,6,7,8,9};


        // ¡¡¡¡¡ Prohibido !!!!!
        try {
            int i = 0;
            do {
                System.out.println(numeros[i]);
                i++;
            } while (i<=numeros.length);
        }catch (Exception e){
            System.out.println("MALLLL");
        }
        // ¡¡¡¡¡ Prohibido !!!!!
    }
}
