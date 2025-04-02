package practice_7.ErrorsAndExceptions;

public class AgeExceptionMain {
    public static void main(String[] args) throws InvalidAgeException {
        validateAge(-5);
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Некорректный возраст: " + age);
        } else {
            System.out.println("Возраст корректен: " + age);
        }
    }
}
