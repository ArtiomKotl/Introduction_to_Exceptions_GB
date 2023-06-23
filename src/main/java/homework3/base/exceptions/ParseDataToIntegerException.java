package homework3.base.exceptions;

public class ParseDataToIntegerException extends NumberFormatException{
    public ParseDataToIntegerException(String s) {
        super("Не удалось преобразовать строку в целое число!: " + s);
    }
}
