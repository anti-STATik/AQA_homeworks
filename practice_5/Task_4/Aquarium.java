package practice_5.Task_4;

public class Aquarium {
    private MarineCreature creature;

    public void addCreature(MarineCreature creature){
        this.creature = creature;
    }

    public void demoMovement(){
        System.out.println("Движение: ");
        creature.move();
    }

    public void demoBehavior(){
        System.out.println("Поведение: ");
        creature.behave();
    }
}
