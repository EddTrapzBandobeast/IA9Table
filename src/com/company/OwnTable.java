package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OwnTable implements ActionListener {
    // To do:
    // Make all the team buttons lables and put textfields under each team
    // so the user can enter a number and it gets saved into a variable
    // Have a button at the end like 'make table', then goes to a different window




    private static JLabel userLabel;
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
    private static JButton goButton;


    private static JTextField userText;
    private static JTextField userText1;
    private static JTextField userText2;
    private static JTextField userText3;
    private static JTextField userText4;
    private static JTextField userText5;
    private static JTextField userText6;
    private static JTextField userText7;
    private static JTextField userText8;
    private static JTextField userText9;
    private static JTextField userText10;
    private static JTextField userText11;

    public OwnTable(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 500); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);

        JLabel tableVariable;
        tableVariable = new JLabel("What would you like to sort?");
        tableVariable.setBounds(50,50,280,30);
        panel.add(tableVariable);

        userText = new JTextField(50);
        userText.setBounds(50,75,165,25);
        panel.add(userText);

        userLabel = new JLabel("Teams:");// JLabel is text on the window
        userLabel.setBounds(50,90,550,100);
        panel.add(userLabel);// you have to add everything to panel

        button1 = new JButton("Fleetdown United");// creates a button with text
        button1.setBounds(50,160,175,50);
        button1.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button1);
        userText1 = new JTextField(25);
        userText1.setBounds(50,215,25,25);
        panel.add(userText1);

        button2 = new JButton("Northfleet Eagles");// creates a button with text
        button2 .setBounds(235,160,175,50);
        button2 .addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button2);
        userText2 = new JTextField(25);
        userText2.setBounds(235,215,25,25);
        panel.add(userText2);

        button3 = new JButton("Belvedere Youth");// creates a button with text
        button3.setBounds(420,160,175,50);
        button3.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button3);
        userText3 = new JTextField(25);
        userText3.setBounds(420,215,25,25);
        panel.add(userText3);

        button4 = new JButton("Parkwood Rangers (G)");// creates a button with text
        button4.setBounds(605,160,175,50);
        button4.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button4);
        userText4 = new JTextField(25);
        userText4.setBounds(605,215,25,25);
        panel.add(userText4);

        button5 = new JButton("Dulwich Village White");// creates a button with text
        button5.setBounds(50,250,175,50);
        button5.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button5);
        userText5 = new JTextField(25);
        userText5.setBounds(50,305,25,25);
        panel.add(userText5);

        button6 = new JButton("Danson Sports Black");// creates a button with text
        button6.setBounds(235,250,175,50);
        button6.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button6);
        userText6 = new JTextField(25);
        userText6.setBounds(235,305,25,25);
        panel.add(userText6);

        button7 = new JButton("Chislehurst Wanderers");// creates a button with text
        button7.setBounds(420,250,175,50);
        button7.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button7);
        userText7 = new JTextField(25);
        userText7.setBounds(420,305,25,25);
        panel.add(userText7);

        button8 = new JButton("Swanscombe Tigers");// creates a button with text
        button8.setBounds(605,250,175,50);
        button8.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button8);
        userText8 = new JTextField(25);
        userText8.setBounds(605,305,25,25);
        panel.add(userText8);

        button9 = new JButton("Junior Reds Sabres");
        button9.setBounds(50,340,175,50);
        button9.addActionListener(this);
        panel.add(button9);
        userText9 = new JTextField(25);
        userText9.setBounds(50,395,25,25);
        panel.add(userText9);

        button10 = new JButton("Welling Wanderers");
        button10.setBounds(235,340,175,50);
        button10.addActionListener(this);
        panel.add(button10);
        userText10 = new JTextField(25);
        userText10.setBounds(235,395,25,25);
        panel.add(userText10);

        goButton = new JButton("Make Table");
        goButton.setBounds(605,400,130,35);
        goButton.addActionListener(this);
        panel.add(goButton);

        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Make Table")){
            System.out.print("Nani kore, huh?, nani kore, enorishimo Junko anatawomakeyo");
        }




    }
}

