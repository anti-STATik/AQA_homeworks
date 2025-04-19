package practice_9.task_4;

public class Manin {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        });
        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Финальное значение: " + counter.getCount());
    }
}
