/**
 * Created by digibrose on 27/01/2016.
 */
public class ConcreteProduct implements Product {

    String S;

    public ConcreteProduct(String S){
        this.S = S;
    }

    @Override
    public void thingy() {
        System.out.println(S);
    }
}
