public class Example6 {
    public static void main(String[] args) {
        try{
            method1(1);
            method1(17);
        } catch (UserException e) {
            System.out.println("Catched: " + e);
        }
    }

    public static void method1(int n) throws UserException {
        if (n>10)
            throw new UserException(n);
        System.out.println("Normal ended");
    }

}
