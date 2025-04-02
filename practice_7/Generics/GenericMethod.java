package practice_7.Generics;

public class GenericMethod {
    public static void main(String[] args) {
       String [] stringArray = {"Привет", "Меня", "Зовут", "Егорка"};
       printArray(stringArray);

       Integer[] integerArray = {1,2,3,4,5};
       printArray(integerArray);
    }

    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }
}




