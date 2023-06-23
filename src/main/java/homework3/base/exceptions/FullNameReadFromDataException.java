package homework3.base.exceptions;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    public FullNameReadFromDataException(String s) {
        super("Исключение для анализа полного имени: " + s);
    }
}
