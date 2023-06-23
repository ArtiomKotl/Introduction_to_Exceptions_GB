package homework3.base.interfaces;

import homework3.base.exceptions.MyFileCreateException;
import homework3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    void writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
