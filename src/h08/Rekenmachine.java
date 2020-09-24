package h08;

//Opdracht 8.3

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Rekenmachine extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    double getal;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    String text;
    String text2;

    public void init() {
        //tekstvak
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2 = new TextField("", 20);
        //+ knop
        b1 = new Button("+");
        b1.addActionListener( new KnopListener() );
        b2 = new Button("-");
        b2.addActionListener( new Knop2Listener() );
        b3 = new Button("*");
        b3.addActionListener( new Knop3Listener() );
        b4 = new Button("/");
        b4.addActionListener( new Knop4Listener() );
        //positie objecten
        add(tekstvak2);
        add(tekstvak);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    //plek andwoord
    public void paint(Graphics g) {
        g.drawString("" + getal, 50, 60 );
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
    //b1 actie
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            text2 = tekstvak2.getText();
            double getal2=Double.parseDouble(text);
            double getal1=Double.parseDouble(text2);
            getal = getal1 + getal2;
            repaint();
        }
    }
    //b2 actie
    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            text2 = tekstvak2.getText();
            double getal2=Double.parseDouble(text);
            double getal1=Double.parseDouble(text2);
            getal = getal1 - getal2;
            repaint();
        }
    }
    //b3 actie
    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            text2 = tekstvak2.getText();
            double getal2=Double.parseDouble(text);
            double getal1=Double.parseDouble(text2);
            getal = getal1 * getal2;
            repaint();
        }
    }
    //b4 actie
    class Knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            text2 = tekstvak2.getText();
            double getal2=Double.parseDouble(text);
            double getal1=Double.parseDouble(text2);
            getal = getal1 / getal2;
            repaint();
        }
    }
}
