package practice_5.Task_4;

public abstract class MarineCreature {
    private String name;

    public MarineCreature (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void move();

    public abstract void behave();

}
