package question6;

/**
 * Created by digibrose on 05/03/2016.
 */
public class lazysingleton {

    private static lazysingleton instance;

    private lazysingleton(){

    }

    public lazysingleton getInstance(){
        if(instance == null){
            instance = new lazysingleton();
        }
        return instance;
    }

}
