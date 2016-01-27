/**
 * Created by digibrose on 27/01/2016.
 */
public abstract class Creator {

    public void anOperation(String S){
        Product product = factoryMethod(S);
        product.thingy();
    }

    protected abstract Product factoryMethod(String s);

}
