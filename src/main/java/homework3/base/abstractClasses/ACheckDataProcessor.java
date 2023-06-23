package homework3.base.abstractClasses;

import homework3.base.interfaces.ICheckBirthday;
import homework3.base.interfaces.ICheckFullName;
import homework3.base.interfaces.ICheckQuantity;
import homework3.base.interfaces.ICheckSex;

// Проверьте процессор обработки данных абстрактный класс
public abstract class ACheckDataProcessor implements ICheckFullName, ICheckQuantity, ICheckBirthday, ICheckSex {
    protected ACheckQuantity checkQuantity;
    protected ACheckFullName checkFullName;
    protected ACheckData checkBirthday;
    protected ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}
