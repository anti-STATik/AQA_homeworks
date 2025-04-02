package practice_7.ErrorsAndExceptions;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException (String message){
        super(message);
    }
}
