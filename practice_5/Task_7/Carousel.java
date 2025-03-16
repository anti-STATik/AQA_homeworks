package practice_5.Task_7;

public class Carousel extends Attraction{
    public Carousel(String name){
        super(name);
    }

    @Override
    public void provideExperience() {
        System.out.println(getName() + ": спокойная поездка");

    }

    @Override
    public void maintain() {
        System.out.println(getName() + ": требует частое ТО движущихся частей");

    }
}
