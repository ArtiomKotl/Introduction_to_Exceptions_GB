package homework3.base.classes.checkInputData;

import homework3.base.abstractClasses.ACheckData;
import homework3.base.abstractClasses.ACheckDataProcessor;
import homework3.base.abstractClasses.ACheckFullName;
import homework3.base.abstractClasses.ACheckQuantity;

// Проверьте процессор обработки данных
public class CCheckDataProcessor extends ACheckDataProcessor {
    public CCheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        super(checkQuantity, checkFullName, checkBirthday, checkSex);
    }

    @Override
    public void checkBirthday(String birthday) {
        super.checkBirthday.checkElement(birthday);
        System.out.println("Birthday format is OK.");
    }

    @Override
    public void checkFullName(String[] fullName) {
        super.checkFullName.checkFullName(fullName);
        System.out.println("Full name format is OK.");
    }

    @Override
    public void checkQuantity(String[] data) {
        super.checkQuantity.checkQuantity(data);
        System.out.println("Quantity data is OK.");
    }

    @Override
    public void checkSex(String sex) {
        super.checkSex.checkElement(sex);
        System.out.println("Sex format is OK.");
    }
}
