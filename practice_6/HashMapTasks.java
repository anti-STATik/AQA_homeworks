package practice_6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Коля", 20);
        people.put("Вася", 15);
        people.put("Петя", 13);
        people.put("Женя", 21);
        System.out.println(people);


        for (Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println("Меня зовут " + entry.getKey() + " и мне " + entry.getValue() + " лет" );
        }

        for (Map.Entry<String, Integer> entry : people.entrySet()){
            if (entry.getValue() < 18){
                System.out.println(entry.getKey() + " и мне меньше 18 лет");
            }
        }
    }
}
