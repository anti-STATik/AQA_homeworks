package practice_8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r1.run();
//
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));
//
//

        Function<String, Integer> getStringLength = s -> s.length();

        System.out.println(getStringLength.apply("привет"));
        System.out.println(getStringLength.apply("1"));
        System.out.println(getStringLength.apply(""));

        Consumer<String> printString = s -> System.out.println(s);

        printString.accept("Hello");
        printString.accept("World!");
    }
}
