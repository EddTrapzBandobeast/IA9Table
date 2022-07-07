package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_2ndChoice implements ActionListener {

    private static JLabel userLabel;
    private static JLabel userLabel2;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    private static JButton button5;
    private static JButton button6;
    private static JButton button7;
    private static JButton button8;
    private static JButton button9;
    private static JButton button10;


    private static JLabel success;

    public GUI_2ndChoice(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 500); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);


        userLabel = new JLabel("Individual Team information");// JLabel is text on the window
        userLabel.setBounds(310,10,550,100);
        panel.add(userLabel);// you have to add everything to panel

        userLabel2 = new JLabel("Team:");// JLabel is text on the window
        userLabel2.setBounds(370,40,550,100);
        panel.add(userLabel2);// you have to add everything to panel

        button1 = new JButton("Fleetdown United");// creates a button with text
        button1.setBounds(100,160,150,50);
        button1.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button1);

        button2 = new JButton("Northfleet Eagles");// creates a button with text
        button2 .setBounds(250,160,150,50);
        button2 .addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button2);

        button3 = new JButton("Belvedere Youth");// creates a button with text
        button3.setBounds(400,160,150,50);
        button3.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button3);

        button4 = new JButton("Parkwood Rangers Green");// creates a button with text
        button4.setBounds(550,160,150,50);
        button4.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button4);

        button5 = new JButton("Dulwich Village White");// creates a button with text
        button5.setBounds(100,250,150,50);
        button5.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button5);

        button6 = new JButton("Danson Sports Black");// creates a button with text
        button6.setBounds(250,250,150,50);
        button6.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button6);

        button7 = new JButton("Chislehurst Wanderers");// creates a button with text
        button7.setBounds(400,250,150,50);
        button7.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button7);

        button8 = new JButton("Swanscombe Tigers");// creates a button with text
        button8.setBounds(550,250,150,50);
        button8.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button8);

        button9 = new JButton("Junior Reds Sabres");// creates a button with text
        button9.setBounds(100,340,150,50);
        button9.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button9);

        button10 = new JButton("Welling Wanderers");// creates a button with text
        button10.setBounds(250,340,150,50);
        button10.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button10);


        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Specific League Table")){
            GUI_login guiNew = new GUI_login();
        }

        else if (e.getActionCommand().equals("Individual Team Information")){
            GUI_LeagueT league = new GUI_LeagueT();
        }


    }
}
