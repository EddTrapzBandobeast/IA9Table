package com.company;

// Daijobou des

public class Main {
    public static void main(String[] args) {

        welcome();

        //RAF First = new RAF(); //accesses class: RAF
        //First.accRead(89,2,8);// The numbers the user has to enter

        //ReadCSV Second = new ReadCSV();
        //Second.doRead();

        GUI_login Third = new GUI_login();
        Third.swing1_do(2);



    }
    public static void welcome(){
        System.out.print("Welcome to the Selkent League!" + "\n");
    }

}