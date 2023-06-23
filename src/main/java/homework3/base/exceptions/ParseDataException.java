package homework3.base.exceptions;

public class ParseDataException extends RuntimeException{
    public ParseDataException(String message) {
        super("Исключение в цикле, во время синтаксического анализа: " + message);
    }
}
