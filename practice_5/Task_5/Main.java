package practice_5.Task_5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.addAnimal(new Cow("Буренка"));
        farm.takeCare();
        farm.collectProduction();

        System.out.println();


        farm.addAnimal(new Chicken("Ципа"));
        farm.takeCare();
        farm.collectProduction();
    }
}
