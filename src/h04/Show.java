package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawRect(20, 20, 150, 400);
        g.drawOval(45, 45, 100, 100);
        g.drawOval(45, 160, 100, 100);
        g.drawOval(45, 285, 100, 100);
        g.drawArc(169, 28, 100, 50, 90, 10);
        g.drawArc(213, 13, 160, 50, 160, 10);
        g.drawArc(210, 0, 160, 50, 190, 10);

    }
}
