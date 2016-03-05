package question6;

/**
 * Created by digibrose on 05/03/2016.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

}
