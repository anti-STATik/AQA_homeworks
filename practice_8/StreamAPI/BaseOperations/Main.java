package practice_8.StreamAPI.BaseOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        // Фильтрация строк по длине больше 5
        List<String> strings = Arrays.asList("Четыре", "Пять", "Восемнадцать", "СорокШесть", "Два");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);

        // Фильтрация чисел, кратных 5
        List<Integer> numbers = Arrays.asList(1,5,10,14,100,111,120);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);

        // Преобразование строк в их длины
        List<String> strings1 = Arrays.asList("Два", "Четыре", "Восемь", "СтоПятьсот", "ДеяностоДевять");
        List<Integer>  lengths = strings1.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(lengths);

        // Создание списка квадратов чисел
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = numbers1.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

        // Удаление дубликатов из списка
        List<Integer> numbers2 = Arrays.asList(1,1,3,3,5,5,4,5,8);
        List<Integer> uniqueNumbers = numbers2.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);

    }
}
