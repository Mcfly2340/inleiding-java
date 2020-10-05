package h10;

// Opdracht 10.4
//Nog niet af!

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Schrikkeljaren extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar en dan heeft Februari 29 dagen";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar en dan heeft Februari 28 dagen";
            }
            repaint();
        }
    }
}