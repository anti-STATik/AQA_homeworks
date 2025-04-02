package practice_7.Generics;

public class Pair<T,U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T item) {
        this.first = item;
    }

    public void setSecond(U item) {
        this.second = item;
    }
}

