package h08;

//Voorbeeld 8.6

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Reset extends Applet {
    TextField tekstvak;
    TextField reset;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Reset");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        //Reset Knop
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();
        }
    }
}
