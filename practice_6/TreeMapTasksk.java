package practice_6;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasksk {
    public static void main(String[] args) {
        TreeMap<String, Integer> score = new TreeMap<>();
        score.put("Ольга", 80);
        score.put("Катерина", 100);
        score.put("Алaна", 95);
        score.put("Алина", 65);
        score.put("Дарья", 78);

        for (Map.Entry<String, Integer> entry : score.entrySet()){
            System.out.println(entry.getKey() + " баллы: " + entry.getValue());
        }
    }
}
