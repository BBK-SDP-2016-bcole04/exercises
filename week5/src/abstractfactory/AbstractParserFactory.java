package abstractfactory;


/**
 * Created by digibrose on 04/02/2016.
 */
public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);


}
