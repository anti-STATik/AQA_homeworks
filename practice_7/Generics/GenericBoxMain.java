package practice_7.Generics;

public class GenericBoxMain {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Текст");
        System.out.println(stringBox.getItem());


        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(12);
        System.out.println(integerBox.getItem());
    }
}
