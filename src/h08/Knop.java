package h08;

//Voorbeeld 8.1

import java.awt.*;
import java.applet.*;


public class Knop extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "Button" );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50, 60 );
    }
}