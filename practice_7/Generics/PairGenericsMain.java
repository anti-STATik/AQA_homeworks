package practice_7.Generics;

public class PairGenericsMain {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>();
        pair1.setFirst("Алексей");
        pair1.setSecond(25);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond() + " лет");

        Pair<Double, Boolean> pair2 = new Pair<>();
        pair2.setFirst(3.14);
        pair2.setSecond(true);
        System.out.println("Число ПИ равно: " + pair2.getFirst()+ " и это: " + pair2.getSecond());
    }
}
