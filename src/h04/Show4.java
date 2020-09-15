package h04;

//Voorbeeld 4.4

import java.awt.*;
import java.applet.*;

public class Show4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        //valerie
        g.drawString("Valerie", 40, 200 );
        g.fillRect(50, 140, 25, 40);
        //jeroen
        g.drawString("Jeroen", 100, 200 );
        //hans
        g.drawString("Hans", 160, 200 );
        //100
        g.drawString("100", 20, 100 );
        //80
        g.drawString("80", 20, 120 );
        //60
        g.drawString("60", 20, 140 );
        //40
        g.drawString("40", 20, 160 );
        //20
        g.drawString("20", 20, 180 );
    }
}
