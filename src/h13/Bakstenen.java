package h13;

import java.applet.Applet;
import java.awt.*;

public class Bakstenen extends Applet {
    double teller;
    double d;

    public void paint(Graphics g){
        for(teller=0; teller<10; teller+=35) {
            tekenBaksteen(g, 20, 20, 50, 20);
        }
    }
    void tekenBaksteen( Graphics g, int x1, int y1, int w1, int h1){
        g.setColor(Color.RED);
        g.fillRect(x1, y1, w1, h1);
    }
}
