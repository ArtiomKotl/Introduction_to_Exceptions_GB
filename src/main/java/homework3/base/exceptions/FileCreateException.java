package homework3.base.exceptions;

import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("Файл не создан: " + message);
    }
}
