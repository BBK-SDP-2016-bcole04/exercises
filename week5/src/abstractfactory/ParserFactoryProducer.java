package abstractfactory;

/**
 * Created by digibrose on 04/02/2016.
 */
public class ParserFactoryProducer  {


public static AbstractParserFactory getFactory(String S) {

    AbstractParserFactory Fac = null;
    try {
        return (AbstractParserFactory) Class.forName("abstractfactory." + S).newInstance();
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    return null;
}

}
