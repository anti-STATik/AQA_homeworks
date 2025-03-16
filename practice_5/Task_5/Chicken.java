package practice_5.Task_5;

public class Chicken extends Animal {

    public Chicken(String name) {
        super(name);
    }



    @Override
    public void care() {
        System.out.println(getName() + "нужно кормить зерном из кормушки");
    }

    @Override
    public void produse() {
        System.out.println(getName() + " несет яйца");

    }


}
