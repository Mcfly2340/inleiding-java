package h12;
//12.4
//NOG NIET AF
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Maak een applet met een tabel met getallen, waarin de gebruiker een getal kan intikken in een tekstvak.
//Als de gebruiker op de OK-knop klikt dan wordt de waarde opgezocht in de tabel
//en staat op het scherm niet alleen dat de waarde is gevonden maar ook de index.
//Als de waarde niet is gevonden dan wordt daarvan melding gedaan.
public class Tekstvakken extends Applet {
    double gtl=0;
    TextField tekstvak;
    Button ok;
    int getal;

    public void init() {
        tekstvak = new TextField("", 20);
        add (tekstvak);
        ok = new Button("ok");
        ok.addActionListener(new ButtonListener());
        ok.addActionListener(new TekstvakListener());
        add(ok);
    }
    public void paint(Graphics g) {
        g.drawString("Het getal is " + gtl, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            gtl = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            for(getal = 0; getal < 10; getal++){
                if(getal<=1){
                    System.out.println("0");
                }else{
                    System.out.println("anders");
                }
            }
        }
    }
}
