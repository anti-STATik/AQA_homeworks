package practice_7.ErrorsAndExceptions;

public class DivisionExample {
    public static void main(String[] args) {
        divide(10,0);
    }

    public static void divide(int a, int b){
        try {
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль запрещено");
        }
    }
}
