package homework3.base.classes.checkInputData;

import homework3.base.abstractClasses.ACheckData;
import homework3.base.exceptions.CheckSexException;
import homework3.base.exceptions.IncorrectSexValuesException;

// Проверьте пол
public class CCheckSex extends ACheckData {
    @Override
    public void checkElement(String data) {
        if(data.equals(""))
            throw new CheckSexException();
        if(!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
    }
}
