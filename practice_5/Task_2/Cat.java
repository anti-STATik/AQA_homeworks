package practice_5.Task_2;

public class Cat implements Pet{
    @Override
    public String getAction() {
        return "Кот играет";
    }

    @Override
    public String getEat() {
        return "кот ест влажный корм";
    }
}
