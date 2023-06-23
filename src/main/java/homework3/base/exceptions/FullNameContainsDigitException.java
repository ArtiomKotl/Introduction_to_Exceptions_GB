package homework3.base.exceptions;

public class FullNameContainsDigitException extends RuntimeException{
    public FullNameContainsDigitException() {
        super("Один или несколько символов в значениях полного имени являются цифрами!!!");
    }
}
