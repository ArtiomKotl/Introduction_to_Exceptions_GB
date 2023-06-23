package homework3.base.abstractClasses;

import homework3.base.interfaces.IRun;

import java.io.IOException;

public abstract class APresenter implements IRun {
    public abstract void run() throws IOException;
}
