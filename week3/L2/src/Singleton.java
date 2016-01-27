/**
 * Created by digibrose on 27/01/2016.
 */
public class Singleton {

private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

}
