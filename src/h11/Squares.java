package h11;
//11.5
import java.applet.Applet;
import java.awt.*;

public class Squares extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;
        int x = 0;

        while(teller < 5) {
            y += 20;
            x += 20;
            g.drawRect(x , y, 20, 20 );
            g.drawString("", 305, y );
            teller++;
        }
    }
}
