package practice_7.ErrorsAndExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("data.txt");
            System.out.println("Файл открыт");
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}
