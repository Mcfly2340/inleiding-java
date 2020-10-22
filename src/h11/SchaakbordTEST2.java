package h11;
//11.9
import java.applet.Applet;
import java.awt.*;

public class SchaakbordTEST2 extends Applet {
    int y = 50, x = 50, breedte = 20, hoogte = 20;

    public void paint(Graphics g) {
        for (int rij = 0; rij < 8; rij++) {
            if (rij % 2 == 0){ //even
                x = 50;
                y += hoogte;
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom % 2 == 0) {
                        g.drawRect(x, y, breedte, hoogte);
                    } else {
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
            } else { //oneven variant (rest is 1)
                x = 50;
                y += hoogte;
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom % 2 == 0) {
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.drawRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
            }
        }
    }
}