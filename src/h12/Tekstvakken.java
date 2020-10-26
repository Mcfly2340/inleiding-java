package h12;
//12.4
import h08.BTW;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Maak een applet met een tabel met getallen, waarin de gebruiker een getal kan intikken in een tekstvak.
//Als de gebruiker op de OK-knop klikt dan wordt de waarde opgezocht in de tabel
//en staat op het scherm niet alleen dat de waarde is gevonden maar ook de index.
//Als de waarde niet is gevonden dan wordt daarvan melding gedaan.
public class Tekstvakken extends Applet {
    double Getal[];
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add (tekstvak);
        Getal = new double[10];
        for (int teller = 0; teller < Getal.length; teller++) {
            if( 0<0 ){
                System.out.println(Getal);
            } else {
                System.out.println(teller);
            }
        }
    }
        public void paint(){

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();
        }
    }
}
