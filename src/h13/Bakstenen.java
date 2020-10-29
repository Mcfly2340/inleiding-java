package h13;
//13.2
import java.applet.Applet;
import java.awt.*;

public class Bakstenen extends Applet {
    double horizontaal;

    public void paint(Graphics g) {
        tekenBaksteen(g, 20, 20, 50, 15);
    }

    void tekenBaksteen(Graphics g, int x1, int y1, int w1, int h1) {
        for (horizontaal = 0; horizontaal < 20; horizontaal++) {
            if (horizontaal % 2 == 0) {
                x1=20;
                for (int verticaal = 0; verticaal < 20; verticaal++) {
                    g.setColor(Color.RED);
                    g.fillRect(x1, y1, w1, h1);
                    x1+=w1+10;
                }
                y1 += 20;
            } else {
                x1=50;
                for(int verticaal=0; verticaal<20; verticaal++){
                    g.setColor(Color.RED);
                    g.fillRect(x1, y1, w1, h1);
                    x1+=w1+10;
                }
                y1 += 20;
            }
        }
    }
}