package h13;

import java.applet.Applet;
import java.awt.*;

public class Bos extends Applet {
    boolean bomen=false, bos=false;
    int teller, teller2;

    public void init(){}
    public void paint(Graphics g){
        for(teller=0; teller < 8; teller++) {
            boom(g, 50 + teller * 35, 25);

        }
        for(teller2=0; teller2 < 8; teller2++) {
            boom(g, 50 + teller2 * 35, 140);

        }
    }
    void boom(Graphics g, int x, int y){
        //trunk
        g.setColor(new Color(160, 82, 45));
        g.drawRect(x+35,y+50,30,80);
        g.setColor(new Color(139, 69, 19));
        g.fillRect(x+35,y+50,30,80);
        //leaves
        g.setColor(Color.green);
        g.fillOval(x,y+25,50,50);
        g.setColor(new Color(0, 100,0));
        g.fillOval(x+50,y+25,50,50);
        g.setColor(new Color(0, 128,0));
        g.fillOval(x+25,y,50,50);
        g.setColor(new Color(50, 205,50));
        g.fillOval(x+25,y+15,50,50);
    }
}
