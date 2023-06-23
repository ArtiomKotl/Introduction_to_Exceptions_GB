package homework3.base.exceptions;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException message) {
        super("Исключение при чтении с консоли: " + message.getMessage());
    }
}
