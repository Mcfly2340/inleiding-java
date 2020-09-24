package h08;

//Opdracht 8.3

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BTW extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button plus;
    String text;
    double btw = 1.21;

    public void init() {
        //tekstvak
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        //+ knop
        add(tekstvak);
        plus = new Button("Ok");
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
            double getal2=Double.parseDouble(text);
            getal = btw * getal2;
            repaint();
        }
    }
}