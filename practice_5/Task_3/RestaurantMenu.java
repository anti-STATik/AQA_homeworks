package practice_5.Task_3;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {

    private List<Dish> dishes;

    public RestaurantMenu(){
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public void printMenu(){
        for (Dish dish : dishes){
            System.out.println(dish.getDescription());
        }
    }
}
