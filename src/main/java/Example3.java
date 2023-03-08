public class Example3 {
    public static void main(String[] args) {
//        int v[] = {1,2,3};
//        int elem = v[3];
        try{
            System.out.println("Element is: " + devuelveNumero());
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("ACABÉ");
        }

    }

    public static int devuelveNumero() throws IndexOutOfBoundsException, ArithmeticException{
        int num = (int)(Math.random()*10);
        if(num>5)
            throw new IndexOutOfBoundsException("Mayor que 5");
        if (num>0 && num<6)
            throw new ArithmeticException("Entre 1 y 5");
        return num;
    }
}
