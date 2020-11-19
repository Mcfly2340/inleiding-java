package h14;

//Voorbeeld 14.3

import java.awt.*;
import java.applet.*;
import java.net.URL;

public class Afbeelding extends Applet {

    private Image afbeelding;
    private URL pad;

    public void init() {
        /* uitgangspunt is dat de package "resources"
                in src map zit. De naam Afbeelding verwijst naar de naam van de klasse */
        pad = Afbeelding.class.getResource("/resources/");
        afbeelding = getImage(pad, "Afbeelding.gif");
    }

    public void paint(Graphics g) {
        g.drawString(pad.toString(), 20, 10 );
        g.drawImage(afbeelding, 20, 20, 400, 300, this);
    }
}
