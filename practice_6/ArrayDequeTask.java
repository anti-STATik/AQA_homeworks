package practice_6;


import java.util.ArrayDeque;

public class ArrayDequeTask {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Первый элемент");
        deque.addLast("Последний элемент");
        deque.add("Серединка");
        deque.addLast("Самый последний элемент");
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

    }
}
