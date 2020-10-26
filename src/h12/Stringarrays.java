package h12;
//Voorbeeld 12.6

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Stringarrays extends Applet {
    String[] namen = { "Valerie", "Jeroen", "Sander", "Frank"};

    public void init() {
        Arrays.sort(namen);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < namen.length; teller ++) {
            g.drawString("" + namen[teller], 50, 20 * teller + 20);
        }
    }
}