package h06;

//Voorbeeld 6.2

import java.awt.*;
import java.applet.*;


public class Reken2 extends Applet {
    double seconden, uur, minuut, dag, jaar, uitkomstu, uitkomstd, uitkomstj;


    public void init() {
        seconden = 60;
        minuut = 60;
        uur = 24;
        dag = 365;
        jaar = 1;
        //uitkomst uur
        uitkomstu = seconden * minuut;
        //uitkomst dag
        uitkomstd = (seconden * minuut) * uur;
        //uitkomst jaar
        uitkomstj = ((seconden * minuut) * uur) * dag;
    }

    public void paint(Graphics g) {
        //uur
        g.drawString(uitkomstu + " seconden in een uur", 40, 40 );
        //dag
        g.drawString(uitkomstd + " seconden in een dag", 40, 60 );
        //jaar
        g.drawString(uitkomstj + " seconden in een jaar", 40, 80 );
    }
}
