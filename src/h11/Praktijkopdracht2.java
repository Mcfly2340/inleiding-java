package h11;
//praktijkopdracht deel 2
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2 extends Applet {
    Label label;
    int tafels, t;
    Button next;
    boolean clicked;

    public void init() {
        //tekstvak
        label = new Label("Klik op de Next knop om de volgende tafel te zien");
        add(label);
        //knop
        next = new Button("Next");
        next.addActionListener(new KnopListener());
        add(next);
        clicked = false;
    }
    public void paint(Graphics g){
        if (clicked == true){
            if (tafels <= 20){
            int teller;
            int y = 0;
            for(teller = 0; teller <= 10; teller++) {
                y += 20;
                g.drawString(teller + " x " + tafels + "= " + tafels * teller, 100, y );
            }
            tafels += 1;
        } else {
            tafels = 0;
            }
        }
    }
    //+ knop actie
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clicked = true;
            repaint();
        }
    }
}