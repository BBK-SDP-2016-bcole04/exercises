/**
 * Created by digibrose on 27/01/2016.
 */
public class SingleLazy {

    private static SingleLazy instance;

    private SingleLazy(){

    }

    public static SingleLazy getInstance(){
        if(instance == null){
            instance = new SingleLazy();
        }
        return instance;
    }

}
