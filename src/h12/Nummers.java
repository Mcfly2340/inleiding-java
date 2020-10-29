package h12;
//praktijkopdracht
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Schrijf een applet in Java, waarin de gebruiker 10 namen en 10 telefoonnummers kan invoeren.
//Telkens als de gebruiker op de Ok-knop klikt, wordt er naar de volgende elementen gegaan van de tabellen.
//Als de gebruiker na het tiende element op de Ok-knop klikt,
//worden alle elementen in het venster getoond.

public class Nummers extends Applet {
    Label namenTekst, nummerTekst;
    TextField nummerVak, namenVak;
    Button knop;
    int teller = 0;
    String[] namen = new String[10];
    int[] nummers = new int[10];

    public void init(){
            namenTekst = new Label("(Full) Name");
            add(namenTekst);
            namenVak = new TextField("", 20);
            add(namenVak);
            nummerTekst = new Label("Telefoon nummer");
            add(nummerTekst);
            nummerVak = new TextField("", 20);
            add(nummerVak);
            knop = new Button("Ok");
            knop.addActionListener(new ButtonListener());
            add(knop);
    }
    public void paint(Graphics g){
        if(teller>=10) {
            for (int i = 0; i < 10; i++) {
                g.drawString("Voornaam = " + namen[i] + ", Telefoonnummer = " + nummers[i], 20, 80 + i * 20);
            }
        }
    }
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            if(teller<10) {
                String s = nummerVak.getText();
                int u = Integer.parseInt(s);
                String t = namenVak.getText();
                namen[teller] = t;
                nummers[teller] = u;
            }
            teller++;
            repaint();
        }
    }
}
