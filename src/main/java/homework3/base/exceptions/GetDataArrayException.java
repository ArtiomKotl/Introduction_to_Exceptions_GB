package homework3.base.exceptions;

public class GetDataArrayException extends RuntimeException{
    public GetDataArrayException() {
        super("Массив данных равен null. Перед получением данных вам необходимо запустить метод ParseData!!!");
    }
}
