package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NummersTEST extends Applet {
    Label tekst;
    TextField tekstvak;
    Button knop;
    String namen;

    public void init(){
        for(int keer = 0; keer <= 8; keer++){
            tekst = new Label("(Full) Name");
            add(tekst);
            tekstvak = new TextField("", 30);
            add(tekstvak);
            knop = new Button("Ok");
            knop.addActionListener(new ButtonListener());
            add(knop);
            namen="";
        }
    }
    public void paint(Graphics g){
        g.drawString("" + namen, 20, 400);
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e ){
            namen=tekstvak.getText();
            System.out.println(namen);
        }
    }
}
