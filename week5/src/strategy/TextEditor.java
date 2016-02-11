package strategy;

/**
 * Created by digibrose on 04/02/2016.
 */
public class TextEditor {

    TextFormatter T;

    TextEditor(TextFormatter T){
        this.T = T;
    }

public void publishText(String S){
    T.format(S);
}

}
