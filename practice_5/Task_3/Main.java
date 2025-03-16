package practice_5.Task_3;

public class Main {
    public static void main(String[] args) {

        RestaurantMenu menu = new RestaurantMenu();

        menu.addDish(new HotDish("Котлета", 70));
        menu.addDish(new Drink("Чай", 330));
        menu.addDish(new HotDish("Суп", 60));
        menu.addDish(new Drink("Кофе", 220));

        menu.printMenu();
    }
}
