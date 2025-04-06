package practice_8.functionalInterfaces;

public class MainMathOperations {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations substract = (x, y) -> x - y;
        MathOperations divide = (x, y) -> x / y;
        MathOperations multiply = (x, y) -> x * y;

        System.out.println(add.apply(1,2.5));
        System.out.println(substract.apply(1,2.5));
        System.out.println(divide.apply(5,2.5));
        System.out.println(multiply.apply(10,2.5));

    }
}
