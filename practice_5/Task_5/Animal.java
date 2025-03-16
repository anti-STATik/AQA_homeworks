package practice_5.Task_5;

public abstract class Animal {
    private String name;

    public Animal (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void care();
    public abstract void produse();

}
