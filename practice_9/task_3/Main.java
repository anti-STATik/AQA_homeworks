package practice_9.task_3;

public class Main {
    public static volatile boolean stop = false;

    public static void main(String[] args) {
        Thread workerThread = new Thread(() ->{
            int counter = 0;
            while (!stop) {
                System.out.println("Счетчик: " + counter++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван");
                }
            }
                System.out.println("Поток остановлен");

        });
        workerThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        stop = true;
        System.out.println("stop переведен в true");
    }
}
