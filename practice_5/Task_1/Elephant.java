package practice_5.Task_1;

public class Elephant implements Animal{

    private String name;

    public Elephant(String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубит");

    }

    @Override
    public void move() {
        System.out.println(name+ " идет");

    }
}
