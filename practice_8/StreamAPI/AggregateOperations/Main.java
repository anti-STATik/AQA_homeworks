package practice_8.StreamAPI.AggregateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //1. Поиск максимального элемента
        List<Integer> numbers = Arrays.asList(1,13,200,2,302,100,2);
        Optional<Integer> maxNumber = numbers.stream()
                .max(Comparator.naturalOrder());
        if(maxNumber.isPresent()){
            System.out.println("Максимальное число: " + maxNumber.get());
        } else {
            System.out.println("Список был пуст");
        }

        // 2. Поиск минимального элемента
        List<Integer> numbers1 = Arrays.asList(1,13,200,2,302,100,2);
        Optional<Integer> minNumber = numbers1.stream()
                .min(Comparator.naturalOrder());
        int resultMin = minNumber.orElse(-1);
        System.out.println("Минимальное число: " + resultMin);

        // 3. Сумма всех элементов списка
        List<Integer> numbers2 = Arrays.asList(1,13,200,2,302,100,2);
        int sum = numbers2.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

//        // 4. Поиск первого элемента, начинающегося на "Б"
        List<String> strings = Arrays.asList("Розовый", "Белый", "Желтый", "Бордовый");
        Optional<String> strinsOnB = strings.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();
        if(strinsOnB.isPresent()){
            System.out.println("Первая на Б: " + strinsOnB.get());
        } else {
            System.out.println("Строк на Б нет");
        }

        // 5. Проверка наличия хотя бы одного элемента по условию
        List<Integer> numbers3 = Arrays.asList(1,3,5,7,2);
        boolean hasEven = numbers3.stream()
                .anyMatch(n -> n % 2 == 0);
        if (hasEven){
            System.out.println("Есть четное число");
        } else {
            System.out.println("Четное число отсутствует");
        }
    }

}
