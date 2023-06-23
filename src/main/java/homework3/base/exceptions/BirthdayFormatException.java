package homework3.base.exceptions;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Неправильный формат дня рождения!!!");
    }
}
