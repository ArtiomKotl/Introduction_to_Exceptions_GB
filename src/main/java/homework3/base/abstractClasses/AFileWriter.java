package homework3.base.abstractClasses;

import homework3.base.classes.workWithFile.CFileCreator;
import homework3.base.classes.workWithFile.CFindTheSameFileName;
import homework3.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
