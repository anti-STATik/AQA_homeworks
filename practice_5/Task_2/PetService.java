package practice_5.Task_2;

public class PetService {
    public void callPet(Pet pet){
        System.out.println(pet.getAction()+ " и " + pet.getEat());
    }
}
