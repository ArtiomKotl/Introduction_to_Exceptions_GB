package homework3.base.exceptions;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Неверное количество элементов во введенных данных!");
    }
}
