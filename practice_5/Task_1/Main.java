package practice_5.Task_1;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal bird = new Bird("Сова");
        Animal elephant = new Elephant("Индийский слон");

        zoo.addAnimal(bird);
        zoo.demonstrateBehaivor();

        zoo.addAnimal(elephant);
        zoo.demonstrateBehaivor();
    }
}
