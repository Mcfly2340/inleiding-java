package h04;

//Voorbeeld 5.1

import java.awt.*;
import java.applet.*;

public class Triangle extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(20, 200, 200, 200);
        g.drawLine(20, 200, 100, 50);
        g.drawLine(200, 200, 100, 50);

    }
}
