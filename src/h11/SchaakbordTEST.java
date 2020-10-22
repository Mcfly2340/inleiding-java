package h11;
//11.9
import java.applet.Applet;
import java.awt.*;

public class SchaakbordTEST extends Applet {
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
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        y = 90;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y = 110;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        y = 130;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y = 150;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        y = 170;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y = 190;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
    }
}