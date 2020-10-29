package h13;
//13.3
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MurenTEST extends Applet {
    Button bakMuur;
    Button betMuur;
    int x1= 20;
    int y1= 20;
    int w1= 50;
    int h1= 15;
    boolean rood = false;
    boolean grijs = false;
    public void init(){
        bakMuur = new Button("Baksteen");
        bakMuur.addActionListener(new ButtonListener());
        add(bakMuur);
        betMuur = new Button("Beton");
        betMuur.addActionListener(new ButtonListener2());
        add(betMuur);
    }
    public void paint(Graphics g){
        if(rood) {
            RodeMuur(g, 36, 42);
        }
        if(grijs) {
            GrijzeMuur(g, 23, 20);
        }
    }

    void RodeMuur(Graphics g, int rij, int kolom){
        int w=50;
        int h=20;
        for (int horizontaal = 0; horizontaal < rij; horizontaal++) {
            for (int verticaal = 0; verticaal < kolom; verticaal++) {
                if (verticaal % 2 == 0) {
                    baksteen(g, horizontaal*w+w/2, verticaal*h, w, h);
                } else {
                    baksteen(g, horizontaal*w, verticaal*h, w, h);
                }
            }
        }
    }
    void GrijzeMuur(Graphics g, int rij, int kolom){
        int w=80;
        int h=40;
        for (int horizontaal = 0; horizontaal < rij; horizontaal++) {
            for (int verticaal = 0; verticaal < kolom; verticaal++) {
                if (verticaal % 2 == 0) {
                    beton(g, horizontaal*w+w/2, verticaal*h, w, h);
                } else {
                    beton(g, horizontaal*w, verticaal*h, w, h);
                }
            }
        }
    }
    void baksteen(Graphics g, int x, int y, int w, int h){
        g.setColor(Color.RED);
        g.fillRect(x, y, w, h);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, w, h);
    }
    void beton(Graphics g, int x, int y, int w, int h){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x, y, w, h);
        g.setColor(Color.GRAY);
        g.drawRect(x, y, w, h);
    }


    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            rood=true;
            grijs=false;
            repaint();
        }
    }
    class ButtonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            rood=false;
            grijs=true;
            repaint();
        }
    }
}
