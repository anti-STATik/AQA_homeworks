package practice_5.Task_3;

public abstract class Dish {
    private String name;

    public Dish(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String getDescription();
}
