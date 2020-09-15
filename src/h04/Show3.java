package h04;

//Voorbeeld 4.3

import java.awt.*;
import java.applet.*;

public class Show3 extends Applet {

    public void init() {
    }
    //House
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.RED);
        g.fillRect(80, 80, 140, 30);
        g.setColor(Color.BLACK);
        g.drawLine(80, 80, 80, 280);
        g.setColor(Color.BLUE);
        g.fillRect(80, 140, 140, 30);
    }
}
