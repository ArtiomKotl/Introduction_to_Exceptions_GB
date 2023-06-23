package homework3.base.classes.checkInputData;

import homework3.base.abstractClasses.ACheckQuantity;
import homework3.base.exceptions.CheckQuantityException;

// проверка количества
public class CCheckQuantity extends ACheckQuantity {
    @Override
    public void checkQuantity(String[] data) {
        if(data.length!=6)
            throw new CheckQuantityException();
    }
}
