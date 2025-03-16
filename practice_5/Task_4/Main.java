package practice_5.Task_4;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        aquarium.addCreature(new Shark("Дуся"));
        aquarium.demoMovement();
        aquarium.demoBehavior();

        aquarium.addCreature(new Star("Звезда"));
        aquarium.demoMovement();
        aquarium.demoBehavior();

    }
}
