package practice_5.Task_6;

public abstract class Plant {
    private String name;

    public Plant(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void watering();

    public abstract void lightning();
}
