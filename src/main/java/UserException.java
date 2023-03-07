public class UserException extends Exception{
    private int num;

    public UserException(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "UserException{" +
                "num=" + num +
                '}';
    }
}
