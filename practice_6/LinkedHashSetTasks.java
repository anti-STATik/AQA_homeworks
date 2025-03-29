package practice_6;

import java.util.LinkedHashSet;

public class LinkedHashSetTasks {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Первый");
        linkedHashSet.add("Второй");
        linkedHashSet.add("Третий");
        linkedHashSet.add("Четвертый");
        linkedHashSet.add("Пятый");
        System.out.println(linkedHashSet);
        addUnique(linkedHashSet, "Пятый");
        System.out.println(linkedHashSet);
        addUnique(linkedHashSet, "Шестой");
        System.out.println(linkedHashSet);
    }

    public static void addUnique(LinkedHashSet<String> set, String element){
        if (!set.contains(element)){
            set.add(element);
        }

    }
}
