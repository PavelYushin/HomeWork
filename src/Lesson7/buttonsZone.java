package Lesson7;

import javax.swing.*;
import java.awt.*;

public class buttonsZone extends JPanel {
//----------------------------------------------
    private JPanel figureBlock;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton plus;
    private JButton minus;
    private JButton multipl;
    private JButton equalM;
    private JButton division;

    public buttonsZone(){
        //============================
        setBackground(Color.orange);

        //-------------------------------------
        figureBlock();
        //====================================
        add(figureBlock); }
        //-------------------------------------
    public void figureBlock(){
        figureBlock = new JPanel();
        setLayout(new GridLayout(4,4));

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        plus = new JButton("+");
        minus = new JButton("-");
        multipl = new JButton("*");
        division = new JButton("/");
        equalM = new JButton("=");

        figureBlock.add(new JPanel());
        figureBlock.add(button7);
        figureBlock.add(button8);
        figureBlock.add(button9);
        figureBlock.add(plus);
        figureBlock.add(new JPanel());
        figureBlock.add(button4);
        figureBlock.add(button5);
        figureBlock.add(button6);
        figureBlock.add(minus);
        figureBlock.add(new JPanel());
        figureBlock.add(button1);
        figureBlock.add(button2);
        figureBlock.add(button3);
        figureBlock.add(division);
        figureBlock.add(new JPanel());
        figureBlock.add(button0);
        figureBlock.add(equalM);
        figureBlock.add(multipl);
    }
//-------------------------------------

}