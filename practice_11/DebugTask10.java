package practice_11;

import java.util.*;
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Alan"));
        names.removeIf(name -> name.startsWith("A"));
        System.out.println(names);
            }
        }
