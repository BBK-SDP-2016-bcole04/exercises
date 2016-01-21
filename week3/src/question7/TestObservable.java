package question7;

import java.util.Observable;

/**
 * Created by digibrose on 21/01/2016.
 */
public class TestObservable extends Observable {

    private int num;

    public void setNum(int num) {
        this.num = num;
        setChanged();
        this.notifyObservers();
    }

    public int getNum() {
        return num;
    }
}
