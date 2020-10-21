package h11;
//11.2
import java.applet.Applet;
import java.awt.*;

public class Ten extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 10; teller <= 20; teller++) {
            y += 20;
            g.drawString("" + teller, 100, y );
        }
    }
}
