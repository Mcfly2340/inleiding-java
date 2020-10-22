package h11;
//11.9
import java.applet.Applet;
import java.awt.*;

public class SchaakbordTEST1 extends Applet {
    int y = 20;
    int x = 20;
    int breedte = 20;
    int hoogte = 20;


    public void paint(Graphics g) {
        y = 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        //tweede rij
        x = 10;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                x+=40;
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x+20, y, breedte, hoogte);
            }
        }
        x=0;
    }
}