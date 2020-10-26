package h12;

import java.applet.Applet;
import java.awt.*;

public class G_Tabel extends Applet {
    double salaris[];

    public void init() {
        salaris = new double[10];

        for (int teller = 0; teller < salaris.length; teller++) {
                salaris[teller] = 10 * teller + 10;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
                g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
    }
}
