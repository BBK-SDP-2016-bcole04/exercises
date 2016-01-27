/**
 * Created by digibrose on 27/01/2016.
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod(String S) {
        return new ConcreteProduct(S);
    }
}
