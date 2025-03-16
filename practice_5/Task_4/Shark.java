package practice_5.Task_4;

public class Shark extends MarineCreature{
    public Shark(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " плавает быстро");

    }

    @Override
    public void behave() {
        System.out.println(getName() + " плавает агрессивно");

    }
}
