package practice_5.Task_8;

public class Sculpture extends Exhibit{
    public Sculpture(String name){
        super(name);
    }

    @Override
    public void provideHistory() {
        System.out.println(getName() + ": создана известным мастером и отражает эпоху");

    }

    @Override
    public void ensurePreservation() {
        System.out.println(getName() + ": нуждается в регулярной реставрации");

    }
}
