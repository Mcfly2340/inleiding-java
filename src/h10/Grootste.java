package h10;
//opdracht 10.1

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Grootste extends Applet {
    TextField tekstvak;
    Label label;
    String textFromTekstvak, tekst; //bijvoorbeeld "hallo"
    int jaartal; //variabele met de naam "jaartal" en als dataype 'int' (dus er mogen alleen hele getallen in deze variabele)
    int grootsteJaartal = 0; //variabele met de naam "grootsteJaartal" ,et als dataype 'int' en deze hebben we vast een waarde gegeven namelijk 0

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textFromTekstvak = tekstvak.getText();
            jaartal = Integer.parseInt(textFromTekstvak); //hier komt de waarde van wat de gebru8iker heeft ingevoerd in het tekstvak
            //System.out.println(jaartal);
            if (grootsteJaartal > jaartal) {
                //hier hoeven we niets veranderne, want het grootsteJaartal blijft het grootsteJaartal
            }
            else {
                grootsteJaartal = jaartal; //het nieuwe grootsteJaartal is hjet getal dat we net hebben ingeoerd (jaartal)

            }
            tekst= "Het grootste getal dat we hebben ingevoerd is : " + grootsteJaartal;
            repaint();
        }
    }
}
