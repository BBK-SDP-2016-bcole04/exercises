package AppP;

import ModelP.Model;
import ViewP.View;
import ControllerP.ControllerP;

/**
 * Created by digibrose on 22/01/2016.
 */
public class AppP {

    public static void main(String[] args){
        String[] Inp = {"a", "b", "c"};
        Model Mod = new Model(Inp);
        View Window = new View();
        ControllerP Cont = new ControllerP(Mod, Window);
        Window.setActionListener(Cont);
    }
}
