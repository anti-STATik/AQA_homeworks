package practice_6;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapTasks {
    public static void main(String[] args) {
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Сергей", "0001");
        phoneBook.put("Евгений", "0002");
        phoneBook.put("Роман", "0003");
        phoneBook.put("Александр", "0004");
        phoneBook.put("Алексей", "0005");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя:");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println(name + " - номер телефона: " + phoneBook.get(name));
        } else {
            System.out.println("Не найдено");
        }
        scanner.close();
    }
}
