package h12;

import java.applet.Applet;
import java.awt.*;

public class Knop25 extends Applet {
    double salaris[];
    int y=20, x;
    Button Knop;

    public void init() {
        salaris = new double [25];

        for (int teller = 0; teller < salaris.length; teller ++) {
            y++;
            x=50;
            Knop= new Button();
            Knop.setLabel("Button");
            Knop.setLocation(x, y);
            add(Knop);
        }
    }

    public void paint(Graphics g) {

        }
    }
