package practice_5.Task_8;

public class Paint extends Exhibit {
    public Paint(String name) {
        super(name);
    }

    @Override
    public void provideHistory() {
        System.out.println(getName() + ": написана красками");

    }

    @Override
    public void ensurePreservation() {
        System.out.println(getName() + ": не обливать супом");

    }
}
