package practice_9.task_2;

public class Main {
    public static void main(String[] args) {
        Runnable printA = new PrintA();
        Runnable printB = new PrintB();

        Thread threadA = new Thread(printA);
        Thread threadB = new Thread(printB);

        threadA.start();
        threadB.start();

    }
}
