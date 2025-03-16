package practice_5.Task_1;

public class Bird implements Animal{

    private String name;

    public Bird(String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " чирикает");

    }

    @Override
    public void move() {
        System.out.println(name + " летает");

    }
}
