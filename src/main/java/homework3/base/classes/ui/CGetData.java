package homework3.base.classes.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.sql.SQLOutput;

import homework3.base.abstractClasses.AGetData;
import homework3.base.exceptions.GetDataException;

// класс получения данных
public class CGetData extends AGetData {
    BufferedReader reader;

    /**
     * Интерфейс консольного ввода.
     */
    public CGetData() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getData() throws IOException {
        String text = """
                Введите данные в произвольном порядке, разделенные пробелом:
                Фамилия Имя Отчество дата рождения номер телефона пол.
                                
                Форматы данных:
                Фамилия, имя, отчество - строки.
                Дата_рождения - строка формата dd.mm.yyyy. (01.05.1900)
                Номер_телефона - целое беззнаковое число без форматирования.
                Пол - символ латиницей f или m.
                Пример ввода: Valetov Andrei Vasilevich 30.10.1972 293658747 m
                """;
        System.out.println(text);
        System.out.print("Введите данные: ");
        String data;
        try {
            data = this.reader.readLine();
        }catch (IOException e){
            throw new GetDataException(new IOException());
        }
        return data;
    }
}
