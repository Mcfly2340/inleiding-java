package h11;
//11.7
import java.applet.Applet;
import java.awt.*;

public class BigCrcle extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int h = 0;
        int w = 0;
        int x = 500;
        int y = 500;


        while(teller < 50) {
            h += 20;
            w += 20;
            x += -10;
            y += -10;
            g.drawOval(x, y, h, w );
            teller++;
        }
    }
}

