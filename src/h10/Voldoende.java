package h10;

//Opdracht 10.5

//Schrijf een applet, waarin de gebruiker zijn cijfers kan invoeren en wordt getoond of het cijfer voldoende of onvoldoende is.
//Tevens wordt het gemiddelde bijgehouden.
//Zodra de gebruiker op de Ok-knop klikt, wordt getoond wat het gemiddelde is en of de leerling geslaagd is.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Voldoende extends Applet {
    TextField tekstvak, tekstvak2;
    Label label;
    double s;
    double d;
    double and, e, q;

    String w;
    String a;
    String tekst;
    String tekst2;
    String text;
    String text2;
    Button button1;
    double voldoende = 5.5, m, getal;

    public void init() {
        label = new Label("Type een cijfer onder de 10 en druk op enter");
        add(label);

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        tekstvak2 = new TextField("", 20);
        add(tekstvak2);

        button1 = new Button();
        button1.setLabel("Gemmiddelde");
        button1.addActionListener(new buttonListener());
        button1.addActionListener(new tekstvakListener());
        add(button1);
        tekst = "";
        tekst2 = "";

        q = d*10;
        e = (int)q;
        and = e/10;
        getal = and;
    }

    public void paint(Graphics g) {
        g.drawString("Het totaal = " + m, 50, 120);
        g.drawString(("Gemiddelde = " + getal + tekst2), 50, 100);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            w = tekstvak.getText();
            a = tekstvak2.getText();
            s = Double.parseDouble(w);
            d = Double.parseDouble(a);
            m = (s + d);

            repaint();
        }
    }
    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            text2 = tekstvak2.getText();
            double getal1=Double.parseDouble(text2);
            double getal2=Double.parseDouble(text);
            getal = (getal1 + getal2) / 2;
            if (getal < voldoende) {
                tekst2 = " = Onvoldoende";
            }
            else {
                tekst2 = " = Voldoende";
                System.out.println(tekst2);
            }
            repaint();
        }
    }
}
