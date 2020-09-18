package h06;

//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Reken2 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("De kinderen krijgen ieder €" + uitkomst, 20, 20);
    }
}
