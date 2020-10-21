package h11;
//11.4
import java.applet.Applet;
import java.awt.*;

public class Tafel3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 3; teller <= 30; teller+=3) {
            y += 20;
            g.drawString("" + teller, 100, y );
        }
    }
}
