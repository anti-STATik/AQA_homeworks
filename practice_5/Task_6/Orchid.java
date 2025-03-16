package practice_5.Task_6;

public class Orchid extends Plant{
    public Orchid(String name){
        super(name);
    }

    @Override
    public void watering() {
        System.out.println(getName() + " нужен регулярный полив, при высокой влажности");
            }

    @Override
    public void lightning() {
        System.out.println(getName() + " любит тень");

    }
}
