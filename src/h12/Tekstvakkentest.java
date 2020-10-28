package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tekstvakkentest extends Applet {
    boolean gevonden;
    int[] salaris = { 1, 2, 5, 4, 3 };
    int gtl;
    TextField tekstvak;
    Button ok;
    int getal = 0;

    public void init() {
        gevonden = false;
        tekstvak = new TextField("", 20);
        add (tekstvak);
        ok = new Button("ok");
        ok.addActionListener(new ButtonListener());
        add(ok);
        gtl = Integer.parseInt(tekstvak.getText());
    }

    public void paint(Graphics g) {
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            while(getal < salaris.length) {
                if(salaris[getal] == gtl) {
                    gevonden = true;
                }else{
                    gevonden = false;
                }
                getal ++;
            }
            if(gevonden == true) {
                System.out.println("De waarde is gevonden.");
            }
            else {
                System.out.println("De waarde is niet gevonden.");
            }
        }
    }
}
