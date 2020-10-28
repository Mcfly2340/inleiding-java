package h12;
//12.6
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Maak een tabel, waarin elementen dezelfde waarde hebben.
//In de applet kan de gebruiker een waarde intikken.
//Vervolgens laat het programma de waarde zien en hoeveel keer de waarde voorkomt.
public class Waarden extends Applet {
    boolean gevonden;
    int[] getallen = { 1, 2, 3, 4, 5, 6, 8, 2, 5, 8, 1, 6, 5, 3, 7, 7, 3, 8, 9, 10, 43, 54, 23, 76, 897, 433, 23, 0 };
    int teller = 0, tekstvakgetal, index, totaal;
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
            g.drawString(index+" zit in de lijst ", 50, 50);
            g.drawString("het getal zit " + totaal + " keer in de lijst", 50, 70);
        }else{
            g.drawString("dit getal zit niet in de lijst", 50, 50);
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //tekstvakgetal omzetten naar int
            tekstvakgetal = Integer.parseInt(tekstvak.getText());
            gevonden=false;
            teller=0;
            totaal = 0;
            while(teller < getallen.length) {
                if(getallen[teller]==tekstvakgetal){
                    gevonden=true;
                    index=getallen[teller];
                    totaal++;
                }
                teller ++;
            }
            repaint();
        }
    }
}