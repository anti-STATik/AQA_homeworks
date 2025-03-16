package practice_5.Task_5;

public class Cow extends Animal{
    public Cow(String name){
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " требует выпаса на лугу");

    }

    @Override
    public void produse() {
        System.out.println(getName() + " дает молоко");

    }
}
