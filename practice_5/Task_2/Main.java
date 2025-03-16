package practice_5.Task_2;

public class Main {
    public static void main(String[] args) {
        PetService petService = new PetService();
        Pet cat = new Cat();
        Pet dog = new Dog();

        petService.callPet(cat);
        petService.callPet(dog);
    }
}
