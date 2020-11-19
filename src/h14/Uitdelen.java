package h14;
//opdracht 14.2
import java.applet.Applet;
import java.awt.*;
import java.util.Random;


public class Uitdelen extends Applet {

    String[]soort={"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
    String[]kleur={"♤","♡","◇","♧"};

    String[] speler1=new String[13];
    String[] speler2=new String[13];
    String[] speler3=new String[13];
    String[] speler4=new String[13];

    String[] deck=new String[52];

    Random rand;

    public void init() {

        rand=new Random();


        int teller=0;
        for(int i = 0; i< soort.length; i++){
            for(int j = 0; j< kleur.length; j++){
                deck[teller]= kleur[j]+ soort[i];
                teller++;

            }
        }
        for(int i=0; i<13;i++){
            speler1[i]= deelKaart();
            speler2[i]= deelKaart();
            speler3[i]= deelKaart();
            speler4[i]= deelKaart();
        }

    }

    public void paint(Graphics g) {
        g.drawString("speler1", 20, 20);
        g.drawString("speler2", 90, 20);
        g.drawString("speler3", 160, 20);
        g.drawString("speler4", 230, 20);
            for(int i=0;i<13;i++){
                int y=40+i*20;
                g.drawString(speler1[i], 30, y);
                g.drawString(speler2[i], 100, y);
                g.drawString(speler3[i], 170, y);
                g.drawString(speler4[i], 240, y);
            }
            //System.out.println(speler1);
        }
    private String deelKaart() {
        int random = rand.nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];

        int hulpindex = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }

        deck = hulpLijst;

        return kaart;
    }
}
