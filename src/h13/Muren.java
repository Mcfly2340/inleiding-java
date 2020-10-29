package h13;
//13.3
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Muren extends Applet {
    Button bakMuur;
    Button betMuur;
    int x1= 20;
    int y1= 20;
    int w1= 50;
    int h1= 15;
    boolean Square;
     public void init(){
        bakMuur = new Button("Baksteen");
        bakMuur.addActionListener(new ButtonListener());
         add(bakMuur);
        betMuur = new Button("Beton");
        betMuur.addActionListener(new ButtonListener2());
         add(betMuur);
     }
     public void paint(Graphics g){
         Square = false;
        if (Square)
            g.drawString("yes", 50, 50);
            g.setColor(Color.RED);
            g.fillRect(x1, y1, w1, h1);
     }
     class ButtonListener implements ActionListener{
         public void actionPerformed(ActionEvent e){
             for (int horizontaal = 0; horizontaal < 20; horizontaal++) {
                 if (horizontaal % 2 == 0) {
                     for (int verticaal = 0; verticaal < 20; verticaal++) {
                         //g.setColor(Color.RED);
                         //g.fillRect(x1, y1, w1, h1);
                         Square = true;
                         System.out.println("Yes");
                         x1+=w1+10;
                         repaint();
                     }
                     y1 += 20;
                 } else {
                     x1=50;
                     for(int verticaal=0; verticaal<20; verticaal++){
                         //g.setColor(Color.RED);
                         //g.fillRect(x1, y1, w1, h1);
                         System.out.println("No");
                         x1+=w1+10;
                     }
                     y1 += 20;
                 }
             }
         }
     }
    class ButtonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for (int horizontaal = 0; horizontaal < 20; horizontaal++) {
                if (horizontaal % 2 == 0) {
                    for (int verticaal = 0; verticaal < 20; verticaal++) {
                        //g.setColor(Color.GREY);
                        //g.fillRect(x1, y1, w1, h1);
                        System.out.println("1");
                        x1+=w1+10;
                    }
                    y1 += 20;
                } else {
                    x1=50;
                    for(int verticaal=0; verticaal<20; verticaal++){
                        //g.setColor(Color.GREY);
                        //g.fillRect(x1, y1, w1, h1);
                        System.out.println("2");
                        x1+=w1+10;
                    }
                    y1 += 20;
                }
            }
        }
    }
}
