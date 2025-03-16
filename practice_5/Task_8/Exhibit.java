package practice_5.Task_8;

public abstract class Exhibit {
    private String name;

    public Exhibit(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void provideHistory();
    public abstract void ensurePreservation();
}
