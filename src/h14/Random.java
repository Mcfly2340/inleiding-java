package h14;

//Voorbeeld 14.1

import java.awt.*;
import java.applet.*;

public class Random extends Applet {

    double r;

    public void init() {
        r = Math.random();
    }

    public void paint(Graphics g) {
        g.drawString("" + r, 50, 60 );
    }
}