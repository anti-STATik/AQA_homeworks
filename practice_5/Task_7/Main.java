package practice_5.Task_7;

public class Main {
    public static void main(String[] args) {

        AmusementPark park = new AmusementPark();

//        park.addAttraction(new RollerCoaster("Амер горки"));
//        park.showExperience();
//        park.parfomanceMaintenance();

          park.addAttraction(new Carousel("Лошадки"));
          park.showExperience();
          park.parfomanceMaintenance();

    }
}
