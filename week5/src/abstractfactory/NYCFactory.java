package abstractfactory;


/**
 * Created by digibrose on 04/02/2016.
 */
public class NYCFactory implements AbstractParserFactory {


    @Override
    public XMLParser getParserInstance(String parserType) {

        System.out.println("NYC Parsing order XML.....");
        System.out.println("XMLParser" + parserType);

        try {
            return (XMLParser) Class.forName("abstractfactory.XMLParser" + parserType).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        if (parserType.equals("NYCORDER")) return new XMLParser("NYC Order XML Message");
  //      else return null;
      return null;
    }
}
