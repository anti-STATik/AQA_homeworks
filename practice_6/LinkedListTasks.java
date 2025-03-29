package practice_6;

import java.util.LinkedList;

public class LinkedListTasks {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Катя");
        names.add("Наташа");
        names.add("Света");
        names.add("Оля");
        names.add("Женя");

        System.out.println("Имена: " + names);

        if (!names.isEmpty()){
            System.out.println("Первое имя: " + names.getFirst());
            System.out.println("Последнее имя: " + names.getLast());
        }
    }
}
