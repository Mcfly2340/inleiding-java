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
        //tekstvak
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        //+ knop
        add(tekstvak);
        plus = new Button("+");
        plus.addActionListener( new KnopListener() );
        add(plus);
    }
    //plek andwoord
    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
    }
    //tekstvak actie
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(tekstvak.getText());
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    //+ knop actie
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            double getaltijdelijk=Double.parseDouble(text);
            getal = getal + getaltijdelijk;
            System.out.println(text);
            repaint();
        }
    }
}