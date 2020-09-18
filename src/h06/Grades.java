package h06;

//Voorbeeld praktijkopdracht

import java.awt.*;
import java.applet.*;


public class Grades extends Applet {
    double a, b, c, d, e, f, g1;


//5,9; 6.3; 6,9
    public void init() {
        a = 5.9 ;
        b = 6.3 ;
        c = 6.9 ;
        d = ((a+b+c)/3);
        e = d*10;
        f = (int)e;
        g1 = f/10;
    }

    public void paint(Graphics g) {
        //Negative answer
        g.drawString("Het gemiddelde is: "+g1, 40, 40 );
    }
}
