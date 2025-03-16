package practice_5.Task_1;

public class Zoo {
    private Animal currentAnimal;

    public void addAnimal(Animal animal){
        this.currentAnimal = animal;
    }

    public void demonstrateBehaivor(){
        currentAnimal.makeSound();
        currentAnimal.move();
    }
}
