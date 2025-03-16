package practice_5.Task_7;

public abstract class Attraction {
    private String name;

    public Attraction(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void provideExperience();

    public abstract void maintain();
}
