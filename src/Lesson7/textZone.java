package Lesson7;

import javax.swing.*;
import java.awt.*;
//------------------------------------------
public class textZone extends JPanel {
    private JPanel greetingText;
    private JLabel labelGreet;
    private JPanel panelTextA;
    private JLabel labelTextA;

    //---------------------------------
    public textZone (){
        setBackground(Color.gray);
        setLayout(new GridLayout(2,1));
    //-----------------------------------
        greetingText();
        panelTextA();
    //--------------------------------------
        add(greetingText);
        add(panelTextA);}
    //--------------------------------------
    public void greetingText(){
        greetingText = new JPanel();
        labelGreet = new JLabel("Hey its Greet Message");
        greetingText.setLayout(new GridLayout(1,1));

        greetingText.add(new JLabel());
        greetingText.add(labelGreet);
    }
    //-------------------------------------------------
    public void panelTextA(){
        setBackground(Color.gray);
        panelTextA = new JPanel();
        panelTextA.setLayout(new GridLayout(1,1));

        panelTextA.add(new JLabel("Text Area"));

    }
}