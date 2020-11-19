package h14;

//Voorbeeld 14.4

import java.awt.*;
import java.applet.*;
import java.net.URL;

public class LoadAndPlay extends Applet {

    private URL pad;
    private AudioClip sound;

    public void init() {

        /* uitgangspunt is dat de package "resources"
                in de src map zit */
        pad = LoadAndPlay.class.getResource("/resources/");
        sound = getAudioClip(pad, "scream.wav");

    }

    public void paint(Graphics g) {
        sound.play();
    }
}
