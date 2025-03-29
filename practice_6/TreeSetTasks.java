package practice_6;

import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(50);
        System.out.println(treeSet);

        if (!treeSet.isEmpty()){
            System.out.println("Наименьший элемент: " + treeSet.first());
            System.out.println("Наибольший элемент: " + treeSet.last());
        }

    }
}
