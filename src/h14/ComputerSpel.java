package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class ComputerSpel extends Applet {

    TextField tekstVak;
    Button knop;
    Label label;
    Label moreText;
    private Image afbeelding;
    private URL pad;
    int AantalSteenen  = 23;
    int gepaktSpeler, gepaktComputer;

    Random random = new Random();

    public void init(){
        tekstVak = new TextField("", 3);
        knop = new Button();
        label = new Label("Hoeveel smileys neem je (1, 2 of 3)?");
        moreText=new Label(" Aantal resterende smileys: 23. Jouw beurt");
        tekstVak.addActionListener( new TekstvakListener() );
        add(label);
        //+ knop
        add(tekstVak);
        knop = new Button("Ok");
        knop.addActionListener( new TekstvakListener() );
        add(knop);
        add(moreText);
        pad = Afbeelding.class.getResource("/resources/");
        afbeelding = getImage(pad, "smiley.png");
    }

    public void getalSpeler() {

        int tekstVakText = 0;
        tekstVakText = Integer.parseInt(tekstVak.getText());


        //speler
        if (tekstVakText <= 3 && tekstVakText >= 1) {
            if (tekstVakText == 1) {
                gepaktSpeler = tekstVakText;
            }
            if (tekstVakText == 2) {
                gepaktSpeler = tekstVakText;
            }
            if (tekstVakText == 3) {
                gepaktSpeler = tekstVakText;
            }
        } else {
            gepaktSpeler = 0;
        }
        AantalSteenen -= gepaktSpeler;
    }

        public void getalComputer(){
        //computer
            if(gepaktSpeler!=0) {
                if (AantalSteenen % 4 == 0) {
                    gepaktComputer = 3;
                }
                if (AantalSteenen % 4 == 1) {
                    gepaktComputer = random.nextInt(3)+1;
                }
                if (AantalSteenen % 4 == 2) {
                    gepaktComputer = 1;
                }
                if (AantalSteenen % 4 == 3) {
                    gepaktComputer = 2;
                }
                AantalSteenen -= gepaktComputer;
            }
        }

    class TekstvakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            getalSpeler();
            getalComputer();

            repaint();
        }
    }

    public void paint(Graphics g){
        moreText.setText("De computer heeft " + gepaktComputer + " smileys weggehaald." +
                " Aantal resterende smileys:" + AantalSteenen + ". Jouw beurt");

        int y=50;
        int x=50;
        for(int i = 0; i<AantalSteenen; i++) {
            if (i%5==0) {
                x = 50;
                y += 50;
            }
                g.drawImage(afbeelding, x, y, 40, 40, this);
                x+=50;
        }
        if (AantalSteenen == 0){

            g.drawString("je hebt gewonnen!",100,100);

        }
        if (AantalSteenen < 0){
            g.drawString("je hebt verloren!",100,100);
        }
    }

}
