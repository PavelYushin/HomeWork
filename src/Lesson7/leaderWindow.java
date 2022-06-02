package Lesson7;

import javax.swing.*;
import java.awt.*;

//----------------------------------------------
public class leaderWindow extends JFrame {
    private int windowW = 699;
    private int windowH = 699;
    private int windowX = 130;
    private int windowY = 130;

    public leaderWindow (){
        //-----------------------------------------
        buttonsZone = new buttonsZone();
        textZone = new textZone();
        add(textZone, BorderLayout. NORTH);
        add(buttonsZone,BorderLayout.SOUTH);
        //-----------------------------------------
        windowSettings();
        //-----------------------------------------
        setVisible(true);
    }
    private void windowSettings(){
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLocation(windowX,windowY);
    setTitle("megaGui");
    setSize(windowW,windowH);}
//-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-
    private buttonsZone buttonsZone;
    private textZone textZone;
}