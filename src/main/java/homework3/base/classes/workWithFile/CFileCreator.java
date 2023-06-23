package homework3.base.classes.workWithFile;

import java.io.File;
import java.io.IOException;

import homework3.base.abstractClasses.AFileCreator;
import homework3.base.exceptions.FileCreateException;

// Класс создателя файла
@SuppressWarnings("ALL")
public class CFileCreator extends AFileCreator {
    /**
     * Создает новый файл по указанному пути.
     *
     * @param path - путь плюс имя файла и расширение.
     */
    @Override
    public void createFile(String path) throws FileCreateException {
        super.file = new File(path);
        try {
            super.file.createNewFile();
        }catch (IOException e){
            throw new FileCreateException(e.getMessage());
        }
    }
}
