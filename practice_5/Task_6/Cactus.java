package practice_5.Task_6;

public class Cactus extends Plant{
    public Cactus(String name){
        super(name);
    }

    @Override
    public void watering() {
        System.out.println(getName() + " требует редкого полива");

    }

    @Override
    public void lightning() {
        System.out.println(getName() + " любит большое количество света");

    }
}
