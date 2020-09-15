package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.BLUE);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        g.drawString("Rick", 150, 130 );
    }

}