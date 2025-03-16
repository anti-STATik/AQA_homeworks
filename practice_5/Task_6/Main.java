package practice_5.Task_6;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.addPlant(new Cactus("Кактус"));
        garden.waterPlant();
        garden.provideLight();
    }
}
