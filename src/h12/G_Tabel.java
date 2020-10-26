package h12;

import java.applet.Applet;
import java.awt.*;

public class G_Tabel extends Applet {
    double Getal[];
    int Gemiddelde;

    public void init() {
        Getal = new double[10];
        for (int teller = 0; teller < Getal.length; teller++) {
                Getal[teller] = 5 * teller + 5.5;
        }
        Gemiddelde = 28;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < Getal.length; teller++) {
                g.drawString("" + Getal[teller], 50, 20 * teller + 20);
        }
        g.drawString("Gemiddelde = " + Gemiddelde, 100, 20);
    }
}
