package h14;
//opdracht 14.1
import h08.Knop2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Kaarten extends Applet {

    String[]soort2={"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
    String[]kleur2={"♤","♡","◇","♧"};
    Random rand;
    String kaart="";
    Button knop;

    public void init() {

        knop = new Button("Klik op mij");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);

        rand=new Random();

    }

    public void paint(Graphics g) {
        g.drawString(kaart, 50, 60 );
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            int soort = rand.nextInt(13);
            int kleur = rand.nextInt(4);
            kaart=kleur2[kleur]+" "+soort2[soort];
            repaint();
        }
    }
}
