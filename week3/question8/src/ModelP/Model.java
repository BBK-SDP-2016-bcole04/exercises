package ModelP;

/**
 * Created by digibrose on 22/01/2016.
 */
public class Model {

    String[] Val;
    int counter;

    public Model(String[] Values){

        Val = new String[Values.length];
        counter = 0;
        for (int i=0; i<Values.length;i++){
            Val[i]=Values[i];
        }

    }

    public String getValue(){
        String ret = Val[counter];
        counter++;
        if (counter == Val.length) counter = 0;
        return ret;
    }

}
