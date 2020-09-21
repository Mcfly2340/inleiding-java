package h07;

import java.awt.*;
import java.applet.*;

public class Test extends Applet {

    public void init() {
        setSize(400, 300);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}
