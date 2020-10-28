package h12;
//12.4 opdracht
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tekstvakkentest1 extends Applet {

    boolean gevonden;
    int[] getallen = { 1, 2, 3, 4, 5 };
    int teller = 0, tekstvakgetal, index;
    TextField tekstvak;
    Button button;

    public void init(){
        //tekstvak
        tekstvak = new TextField("", 20);
        add (tekstvak);
        //ok button
        button = new Button("ok");
        button.addActionListener(new ButtonListener());
        add(button);
    }
    public void paint(Graphics g){
        if(gevonden==true){
            g.drawString("dit getal zit in de lijst " + index, 50, 50);
        }else{
            g.drawString("dit getal zit niet in de lijst", 50, 50);
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //tekstvakgetal omzetten naar int
            tekstvakgetal = Integer.parseInt(tekstvak.getText());
            //while loop
            gevonden=false;
            teller=0;
            while(teller < getallen.length) {
                if(getallen[teller]==tekstvakgetal){
                    gevonden=true;
                    index=teller;
                }
                teller ++;
                System.out.println(tekstvakgetal);
            }
            repaint();
        }
    }
}