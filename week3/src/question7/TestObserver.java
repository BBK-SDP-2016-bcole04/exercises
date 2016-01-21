package question7;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by digibrose on 21/01/2016.
 */
public class TestObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        TestObservable p = (TestObservable) o;

        System.out.println("value is " + p.getNum());

    }
}
