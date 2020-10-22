package h11;
//11.8
import java.applet.Applet;
import java.awt.*;

//Schrijf een applet waarin minimaal 100 cirkels worden getoond die hetzelfde beginpunt hebben,
//maar elke cirkel wordt iets groter dan de vorige.
public class XpndngCrcle extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int h = 0;
        int w = 0;
        int x = 1000;
        int y = 500;


        while(teller <100){
            h += 10;
            w += 10;
            x += -5;
            y += -5;
            g.drawOval(x, y, h, w );
            teller++;
        }
    }
}
