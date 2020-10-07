package h10;

//Praktijkopdracht

//NIET AF!

//Schrijf een applet in Java waarin een cijfer ingevoerd wordt en in het venster van de applet wordt getoond of het cijfer slecht, onvoldoende, matig, voldoende of goed is. Als er een cijfer wordt ingevoerd dat niet in de onderstaande rij voorkomt, dan moet er een waarschuwing getoond worden dat er een verkeerd cijfer is ingevoerd.

//De cijfers 1, 2 en 3 zijn slecht,
//het cijfer 4 is onvoldoende,
//het cijfer 5 is matig,
//de cijfers 6 en 7 zijn voldoende,
//de cijfers 8, 9 en 10 zijn goed.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cijfers extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfers;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het cijfer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfers = Integer.parseInt(s);
            if (cijfers <= 10) {
                if (cijfers >= 8 && cijfers <= 10) {
                    tekst = "goed";
                }
                if (cijfers >= 6 && cijfers <= 7) {
                    tekst = "voldoende";
                }
                if (cijfers == 4) {
                    tekst = "matig";
                }
                if (cijfers == 5) {
                    tekst = "onvoldoende";
                }
                if (cijfers >= 0 && cijfers <= 3) {
                    tekst = "slecht";
                }
            }
            else {
                tekst = "LAGER DAN 10";
            }
            repaint();
        }
    }
}
