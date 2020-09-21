package h08;

//Voorbeeld 8.6

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Reset extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    Label label;
    String text;

    public void init() {
        //resetknop
        tekstvak = new TextField("", 30);
        knop = new Button("Reset");
        knop.addActionListener( new NewListener() );
        add(knop);
        add(tekstvak);
        //text
        label = new Label("Search");
        add(label);
        //ok knop
        knop2 = new Button("Ok");
        knop2.addActionListener( new KnopListener() );
        add(knop2);
        text="";
    }
    //tekstvak
    class NewListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            System.out.println(tekstvak.getText());
            tekstvak.setText("");
            repaint();
        }
    }
    public void paint(Graphics g) {
        g.drawString("" + text, 50, 60 );
    }
    //uitkomst
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            repaint();
        }
    }
}