package h04;

//Voorbeeld 4.2

import java.awt.*;
import java.applet.*;

public class Show2 extends Applet {

    public void init() {
    }
//House
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        //box
        g.drawRect(50, 100, 150, 150);
        //roof
        g.drawLine(125, 28, 50, 100);
        g.drawLine(200, 100, 125, 28);
        //door
        g.drawRect(100, 200, 25, 50);
        //window
        g.drawRect(150, 180, 30, 30);

    }
}

