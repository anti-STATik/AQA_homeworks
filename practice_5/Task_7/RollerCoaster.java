package practice_5.Task_7;

public class RollerCoaster extends Attraction{
    public RollerCoaster(String name){
        super(name);
    }

    @Override
    public void provideExperience() {
        System.out.println(getName() + ": острые ощущения и высокая скорость");

    }

    @Override
    public void maintain() {
        System.out.println(getName() + ": требуют регулярной проверки безопасности");

    }
}
