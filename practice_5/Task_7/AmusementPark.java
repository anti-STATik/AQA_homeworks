package practice_5.Task_7;

public class AmusementPark {
    public Attraction attraction;

    public void addAttraction(Attraction attraction){
        this.attraction = attraction;
        System.out.println("Добавлен новый аттракцион: " + attraction.getName());
    }

    public void showExperience(){
        System.out.println("Ощущения от катания: ");
        attraction.provideExperience();
    }

    public void parfomanceMaintenance(){
        System.out.println("Частота обслуживания: ");
        attraction.maintain();
    }
}
