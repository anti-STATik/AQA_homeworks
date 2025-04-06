package practice_8.StreamAPI.GroupingAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Группировка строк по первой букве
        List<String> strings = Arrays.asList("Арбуз", "Банан", "Абрикос", "Виноград", "Бинокль", "Волан", "Анкара");
        Map<Character, List<String>> groupedByFirstLetter = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        groupedByFirstLetter.forEach((key, value) ->
                System.out.println("Буква " + key + "->" + value));

        // 2. Группировка чисел по чётности
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println("Четные числа: " + groupedNumbers.get(true));
        System.out.println("Нечетные числа: " + groupedNumbers.get(false));

        // 3. Поиск среднего значения чисел
        List<Integer> numbers2 = Arrays.asList(10,20,30,40,50,60);
        double average = numbers2.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(average);
    }
}
