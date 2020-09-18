package h06;

//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class Reken1 extends Applet {
    double a, b, uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        //jan
        g.drawString("Jan  " + "€" + uitkomst, 40, 40 );
        //ali
        g.drawString("Ali  " + "€" + uitkomst, 40, 60 );
        //jeannette
        g.drawString("Jeannette  " + "€" + uitkomst, 40, 80 );
        //jij
        g.drawString("Jij  " + "€" + uitkomst, 40, 100 );
    }
}
