package practice_9.task_2;

public class PrintB implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Поток В был прервал");
            }
        }
    }
}
