package practice_7.ErrorsAndExceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExceptionMain {
    public static void main(String[] args) {
        try {
            checkEmail("fsg@dfg.ru");
        } catch (InvalidEmailException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
    public static void checkEmail(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if(!matcher.matches()){
            throw new InvalidEmailException("Некорректный e-mail: " + email);
        } else {
            System.out.println("e-mail корректен: " + email);
        }

    }
}
