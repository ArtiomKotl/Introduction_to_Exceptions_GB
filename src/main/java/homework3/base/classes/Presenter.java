package homework3.base.classes;

import java.io.IOException;

import homework3.base.abstractClasses.ACheckDataProcessor;
import homework3.base.abstractClasses.AFileWriter;
import homework3.base.abstractClasses.APresenter;
import homework3.base.classes.parseData.CDataParseProcessor;
import homework3.base.classes.ui.CGetData;

public class Presenter extends APresenter {
    private final CGetData getData;
    private final CDataParseProcessor dataParseProcessor;

    private final ACheckDataProcessor dataProcessor;
    private final AFileWriter fileWriter;

    /**
     * Объединяет в работу пользовательский интерфейс, парсер строки, проверку на валидность элементов строки
     * Пишет, в файлы инфо по заданному формату.
     * @param getData - пользовательский интерфейс.
     * @param dataParseProcessor - парсер строки.
     * @param dataProcessor - проверка элементов на валидность
     * @param fileWriter - пишет в файл согласно условию.
     */
    public Presenter(CGetData getData,
                     CDataParseProcessor dataParseProcessor,
                     ACheckDataProcessor dataProcessor,
                     AFileWriter fileWriter
                     ) {
        this.getData = getData;
        this.dataParseProcessor = dataParseProcessor;
        this.dataProcessor = dataProcessor;
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() throws IOException {
        dataParseProcessor.parseData(getData.getData());
        //Check quantity
        dataProcessor.checkQuantity(dataParseProcessor.getDataArray());
        //Check full name
        dataProcessor.checkFullName(dataParseProcessor.getFullName());
        //Check birthday
        dataProcessor.checkBirthday(dataParseProcessor.getBirthday());
        //Check sex
        dataProcessor.checkSex(dataParseProcessor.getSex());
        System.out.println("\nВсе проверки в порядке!!!");
        // Write data to file
        fileWriter.writeToFile(dataParseProcessor.getInfoToWrite());
    }
}
