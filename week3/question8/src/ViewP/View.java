package ViewP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by digibrose on 22/01/2016.
 */
public class View extends JFrame {

    private JButton But;
    private ActionListener AL;

    public View() {


        But = new JButton("Clickable");

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.NONE;

        add(But, gbc);

        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setActionListener(ActionListener AL) {
        System.out.println("Action listener set");
        this.AL = AL;
        But.addActionListener(AL);
    }

    public void changeButton(String S){
        But.setText(S);
        this.repaint();
    }

}
