package ControllerP;

import ModelP.Model;
import ViewP.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by digibrose on 22/01/2016.
 */
public class ControllerP implements ActionListener {

    private Model M;
    private View V;
    private String Val;

    public ControllerP(Model M, View V){
        this.M = M;
        this.V=V;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Val = M.getValue();
        V.changeButton(Val);
        System.out.println("Action performed");
    }
}
