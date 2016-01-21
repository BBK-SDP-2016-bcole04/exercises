package question7;

/**
 * Created by digibrose on 21/01/2016.
 */
public class testmain {

    public static void main(String[] args){

        TestObservable but = new TestObservable();
        TestObserver look = new TestObserver();

        but.addObserver(look);

        but.setNum(1);






    }
}
