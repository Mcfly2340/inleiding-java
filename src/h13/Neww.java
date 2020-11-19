package h13;

import java.applet.Applet;
import java.awt.*;

public class Neww extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        //int i ,y=20;
        for(int i=0, y = 20;i<10;i++, y+=20) {
            //y+=20;
            if(i==5){
                g.drawString("ik ben halverwegen", 50, y);
                y+=20;
            }
            g.drawString("rick", 50, y);
        }
    }
}
