package h06;

//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Negative extends Applet {
    double P1, P2, N1;


    public void init() {
        P1 = 2147483647 ;
        P2 = 1 ;
        N1 = P1 + P2 ;
    }

    public void paint(Graphics g) {
        //Negative answer
        g.drawString(N1 + " ", 40, 40 );
    }
}
