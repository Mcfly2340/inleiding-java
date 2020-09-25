package h10;

//opdracht 10.3

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maanden extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
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
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "Januari (heeft 31 dagen)";
                    break;
                case 2:
                    tekst = "Februari (heeft 28/29 dagen)";
                    break;
                case 3:
                    tekst = "Maart (heeft 31 dagen)";
                    break;
                case 4:
                    tekst = "April (heeft 30 dagen)";
                    break;
                case 5:
                    tekst = "Mei (heeft 31 dagen)";
                    break;
                case 6:
                    tekst = "Juni (heeft 30 dagen)";
                    break;
                case 7:
                    tekst = "Juli (heeft 31 dagen)";
                    break;
                case 8:
                    tekst = "Augustus (heeft 31 dagen)";
                    break;
                case 9:
                    tekst = "September (heeft 30 dagen)";
                    break;
                case 10:
                    tekst = "Oktober (heeft 31 dagen)";
                    break;
                case 11:
                    tekst = "November (heeft 30 dagen)";
                    break;
                case 12:
                    tekst = "December (heeft 31 dagen)";
                    break;
                default:
                    tekst = "U heeft een nummer ingetikt wat geen maand is (is minder dan 12)";
                    break;
            }
            repaint();
        }
    }
}