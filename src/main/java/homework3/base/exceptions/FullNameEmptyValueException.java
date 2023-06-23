package homework3.base.exceptions;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("Одно или несколько значений в полном имени пусты!!!");
    }
}
