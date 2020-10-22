package h11;
//praktijkopdracht
import h08.BTW;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    int tafels;
    Button ok;
    String text;
    boolean clicked;


    public void init() {
        //tekstvak
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        add(label);
        //knop
        add(tekstvak);
        ok = new Button("Ok");
        ok.addActionListener(new KnopListener());
        add(ok);
        clicked = false;
    }
    public void paint(Graphics g){
        if (clicked == true){
            int teller;
            int y = 0;
            for(teller = 0; teller <= 10; teller++) {
                y += 20;
                System.out.println(tafels);
                g.drawString(teller + " x " + tafels + "= " + tafels * teller, 100, y );
            }
        }
    }
    //+ knop actie
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            tafels = Integer.parseInt(text);
            clicked = true;
            repaint();
        }
    }
}