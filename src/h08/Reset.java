package h08;

//Voorbeeld 8.6

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Reset extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Reset");
        knop.addActionListener( new NewListener() );
        add(tekstvak);
        add(knop);
        label = new Label("Search");
        tekstvak.addActionListener( new Reset.KnopListener() );
        add(label);
        add(tekstvak);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
    }

    class NewListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }
    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}