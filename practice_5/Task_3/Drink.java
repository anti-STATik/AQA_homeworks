package practice_5.Task_3;

public class Drink extends Dish{
    private double volume;

    public Drink(String name, double volume){
        super(name);
        this.volume = volume;
    }


    @Override
    public String getDescription() {
        return "Напиток: " + getName() + ", объемом: " + volume + " мл";
    }
}
