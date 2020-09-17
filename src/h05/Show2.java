package h05;

//Voorbeeld 4.4

import java.awt.*;
import java.applet.*;

public class Show2 extends Applet {
    Color FillColor;
    int Width;
    int HeightV;
    int HeightJ;
    int HeightH;

    public void init() {
        FillColor = Color.BLUE;
        Width = 200;
        HeightV = 25;
        HeightJ = 85;
        HeightH = 65;
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        //Names
        g.drawString("Names", 210, 200 );
        //valerie
        g.drawString("Valerie", 40, 200 );
        g.fillRect(50, 155, 25, HeightV);
        //jeroen
        g.drawString("Jeroen", 100, 200 );
        g.fillRect(105, 95, 25, HeightJ);
        //hans
        g.drawString("Hans", 160, 200 );
        g.fillRect(160, 115, 25, HeightH);
        //KG
        g.drawString("kg", 20, 80 );
        //100
        g.drawString("100", 20, 100 );
        //80
        g.drawString("80", 20, 120 );
        //60
        g.drawString("60", 20, 140 );
        //40
        g.drawString("40", 20, 160 );
        //20
        g.drawString("20", 20, 180 );

    }
}
