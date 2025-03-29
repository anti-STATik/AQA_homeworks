package practice_6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        numbers.add(6);
        System.out.println(numbers);

        for (int number : numbers){
            if (number % 2 == 0){
                System.out.print(number);
            }

        }
    }
}
