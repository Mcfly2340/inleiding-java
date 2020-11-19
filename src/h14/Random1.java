package h14;

//Voorbeeld 14.2

import java.awt.*;
import java.applet.*;

public class Random1 extends Applet {

    double r;
    int worp;

    public void init() {
        r = Math.random();
        worp = (int)(r * 6 + 1);
    }

    public void paint(Graphics g) {
        g.drawString("" + worp, 50, 60 );
    }
}