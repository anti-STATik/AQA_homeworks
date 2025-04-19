package practice_9.task_1;

public class OneThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            for (int i = 0; i < 5; i++){
                System.out.println("Привет из потока");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток был прерван");
                }
            }
        });
        thread.start();
    }
}
