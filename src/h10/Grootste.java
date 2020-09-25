package h10;

//opdracht 10.1

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Grootste extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int jaartal;
    int uitkomst;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener( new Grootste.TekstvakListener() );
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
            if (uitkomst % jaartal > jaartal) {
                tekst = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ uitkomst;
            }
            repaint();
        }
    }
}
