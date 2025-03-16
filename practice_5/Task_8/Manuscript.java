package practice_5.Task_8;

public class Manuscript extends Exhibit{
    public Manuscript(String name){
        super(name);
    }

    @Override
    public void provideHistory() {
        System.out.println(getName() + ": создан в древние времена и хранит уникальные тексты");

    }

    @Override
    public void ensurePreservation() {
        System.out.println(getName() + ": требует контроля влажности и температуры");

    }
}
