package practice_5.Task_5;

public class Farm {
    public Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
    }

    public void takeCare(){
        System.out.println("Уход за животным:");
        animal.care();
    }

    public void collectProduction(){
        System.out.println("Получаем продукцию:");
        animal.produse();
    }



}

