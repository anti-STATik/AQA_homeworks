package practice_5.Task_3;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(String name, int temperature){
        super(name);
        this.temperature = temperature;
    }

    @Override
    public String getDescription() {
        return "Горячее: " + getName() + ", температура подачи: " + temperature + " градусов";
    }
}
