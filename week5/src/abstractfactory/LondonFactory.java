package abstractfactory;


/**
 * Created by digibrose on 04/02/2016.
 */
public class LondonFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {

        System.out.println("London Parsing order XML.....");

        try {
            return (XMLParser) Class.forName("abstractfactory.XMLParser" + parserType).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

      //  if (parserType.equals("LondonFEEDBACK")) return new XMLParser("London Feedback XML Message");
      //  else

        return null;
    }
}
