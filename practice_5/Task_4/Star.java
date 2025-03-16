package practice_5.Task_4;

public class Star extends MarineCreature{
    public Star(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " передвигается медленно");
    }

    @Override
    public void behave() {
        System.out.println(getName() + " ползает по дну");

    }
}
