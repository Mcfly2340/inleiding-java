package h08;

//Voorbeeld 8.2

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoeveelheid extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button plus;
    String text;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        plus = new Button("+");
        plus.addActionListener( new KnopListener() );
        add(plus);
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            repaint();
        }
    }
}