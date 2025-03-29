package practice_6;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(15);
        queue.offer(5);
        queue.offer(30);

        System.out.println("Элементы по приоритету:");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
