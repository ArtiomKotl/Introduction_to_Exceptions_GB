package homework3.base.classes.checkInputData;

import homework3.base.abstractClasses.ACheckFullName;
import homework3.base.exceptions.FullNameContainsDigitException;
import homework3.base.exceptions.FullNameEmptyValueException;

// Полное имя проверка
public class CCheckFullName extends ACheckFullName {

    @Override
    public void checkFullName(String[] fullName) {

        for (String s : fullName) {
            if (s.length() == 0)
                throw new FullNameEmptyValueException();
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j)))
                    throw new FullNameContainsDigitException();
            }
        }
    }
}
