package practice_6;

import java.util.HashSet;

public class HashSetTasks {
    public static void main(String[] args) {
       HashSet<Integer> numbers = new HashSet<>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       numbers.add(4);
       numbers.add(5);
       numbers.add(6);
       numbers.add(7);
       numbers.add(8);
       numbers.add(9);
       numbers.add(10);
       numbers.add(10);
       numbers.add(3);
       numbers.add(2);

        System.out.println(numbers);

        int numberToCheck = 11;
        if (numbers.contains(numberToCheck)){
            System.out.println(numberToCheck + " находится в сете");
        } else {
            System.out.println(numberToCheck + " отсутствует в сете" );
        }
    }
}
