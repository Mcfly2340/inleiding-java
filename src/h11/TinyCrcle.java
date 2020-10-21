package h11;
//11.6
import java.applet.Applet;
import java.awt.*;

public class TinyCrcle extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int h = 0;
        int w = 0;
        int x = 200;
        int y = 200;


        while(teller < 5) {
            h += 20;
            w += 20;
            x += -10;
            y += -10;
            g.drawOval(x, y, h, w );
            teller++;
        }
    }
}
