package practice_5.Task_2;

public class Dog implements Pet{
    @Override
    public String getAction() {
        return "Собака гуляет";
    }

    @Override
    public String getEat() {
        return "собака ест сухой корм";
    }
}
