package practice_5.Task_6;

public class Garden {
    private Plant plant;

    public void addPlant(Plant plant){
        this.plant = plant;
        System.out.println("Новое растение в саду: " + plant.getName());
    }

    public void waterPlant(){
        System.out.println("Полив:");
        plant.watering();
    }

    public void provideLight(){
        System.out.println("Освещение:");
        plant.lightning();
    }
}
