
package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *In this Class, Methods are defined which are further used in Designing the Output Frames of Different Levels.
 *Methods defined are     DesigningOutputFrame,settingBounds, settingText, settingColor,SettingEditability, addingToFrame.
 *designingOutputFrame :  In this method, the 1st Frame in the output is Designed.
 *settingBounds        :  In this method, Bounds for all the buttons and Boxes are set up which are used in Output frame of different levels.
 settingText          :  In this method, Initial Text is set for all the boxes to Empty.
 * settingColor        :  In this method, Color of all the boxes is initially set to White.
 * settingEditable     :  In this method, all the boxes are set Editable.
 * addingToFrame       :  In this method, all the components are added to frame which appears after the Main Frame.
  **/

public  class Designing extends ComponentsDefined   {
    Font font = new Font("Serif", Font.BOLD,25);

    Designing(){
   designingMainFrame();
}
String s;    
     //It is used to Display Main Output Frame.
     //it is defined private as we are not gonna use it out of our class and no one can access it in any other class
   //as it defines the coding OF main Frame of the Output.

    private void   designingMainFrame(){
mainFrame.setSize(500,300);
mainFrame.add(mainPanel);
mainFrame.setLocationRelativeTo(easy);

mainArea.setBounds(0,0,500,300);
mainArea.setFont(font);

mainArea.setText("\tWelcome to Sudoku\n\nPress your Desired Button to Play the game.");
mainArea.setVisible(true);
mainArea.setEditable(false);
easy.setBounds(150,150,50,35);
medium.setBounds(220,150,55,35);
hard.setBounds(290,150,50,35);
help.setBounds(170,200,150,35);
mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
mainFrame.setVisible(true);
mainFrame.setResizable(false);

mainFrame.add(easy);
mainFrame.add(medium);
mainFrame.add(hard);
mainFrame.add(help);
mainFrame.add(mainArea);
mainFrame.add(mainPanel);
    
    }

    /**
     *It is used to Set Bounds for Buttons and Boxes.
     */
    protected void settingBounds(){

        frame.setVisible(true);
    frame.setSize(500,400);

    box1.setBounds(10,30,30,30);
    box2.setBounds(10,70,30,30);
    box3.setBounds(10,110,30,30);
    box4.setBounds(10,150,30,30);
    box5.setBounds(10,190,30,30);
    
    box6.setBounds(60,30,30,30);
    box7.setBounds(60,70,30,30);
    box8.setBounds(60,110,30,30);
    box9.setBounds(60,150,30,30);
    box10.setBounds(60,190,30,30);
    
    box11.setBounds(110,30,30,30);
    box12.setBounds(110,70,30,30);
    box13.setBounds(110,110,30,30);
    box14.setBounds(110,150,30,30);
    box15.setBounds(110,190,30,30);
    
     box16.setBounds(160,30,30,30);
    box17.setBounds(160,70,30,30);
    box18.setBounds(160,110,30,30);
    box19.setBounds(160,150,30,30);
    box20.setBounds(160,190,30,30);
    
    box21.setBounds(210,30,30,30);
    box22.setBounds(210,70,30,30);
    box23.setBounds(210,110,30,30);
    box24.setBounds(210,150,30,30);
    box25.setBounds(210,190,30,30);
    }

    /**
     *It is used to Set Text of a Box to Empty.
     */
    protected void settingText(){
box1.setText("");
box2.setText("");
box3.setText("");
box4.setText("");
box5.setText("");
box6.setText("");
box7.setText("");
box8.setText("");
box9.setText("");
box10.setText("");
box11.setText("");
box12.setText("");
box13.setText("");
box14.setText("");
box15.setText("");
box16.setText("");
box17.setText("");
box18.setText("");
box19.setText("");
box20.setText("");
box21.setText("");
box22.setText("");
box23.setText("");
box24.setText("");
box25.setText("");

   }

    /**
     *It is used to set Color of boxes to White
     */
    protected void settingColor(){
     box1.setBackground(Color.WHITE);
    box2.setBackground(Color.WHITE);
    box3.setBackground(Color.WHITE);
    box4.setBackground(Color.WHITE);
    box5.setBackground(Color.WHITE);
    box6.setBackground(Color.WHITE);
    box7.setBackground(Color.WHITE);
    box8.setBackground(Color.WHITE);
    box9.setBackground(Color.WHITE);
    box10.setBackground(Color.WHITE);
    box11.setBackground(Color.WHITE);
    box12.setBackground(Color.WHITE);
    box13.setBackground(Color.WHITE);
    box14.setBackground(Color.WHITE);
    box15.setBackground(Color.WHITE);
    box16.setBackground(Color.WHITE);
    box17.setBackground(Color.WHITE);
    box18.setBackground(Color.WHITE);
    box19.setBackground(Color.WHITE);
    box20.setBackground(Color.WHITE);
    box21.setBackground(Color.WHITE);
    box22.setBackground(Color.WHITE);
    box23.setBackground(Color.WHITE);
    box24.setBackground(Color.WHITE);
    box25.setBackground(Color.WHITE);
    panel.setBackground(Color.WHITE);
    }

    /**
     *It is used to Set Editability of Boxes.
     */
    protected void settingEditability(){
    box1.setEditable(true);
    box2.setEditable(true);
    box3.setEditable(true);
    box4.setEditable(true);
    box5.setEditable(true);
    box6.setEditable(true);
    box7.setEditable(true);
    box8.setEditable(true);
    box9.setEditable(true);
    box10.setEditable(true);
    box11.setEditable(true);
    box12.setEditable(true);
    box13.setEditable(true);
    box14.setEditable(true);
    box15.setEditable(true);
    box16.setEditable(true);
    box17.setEditable(true);
    box18.setEditable(true);
    box19.setEditable(true);
    box20.setEditable(true);
    box21.setEditable(true);
    box22.setEditable(true);
    box23.setEditable(true);
    box24.setEditable(true);
    box25.setEditable(true);}

    /**
     *It is used to Add all the Components to frame.
     */
    protected void addingtoframe(){
        frame.setAlwaysOnTop(false);
    frame.add(box1);
    frame.add(box2);
    frame.add(box3);
    frame.add(box4);
    frame.add(box5);
    frame.add(box6);
    frame.add(box7);
    frame.add(box8);
    frame.add(box9);
    frame.add(box10);
    frame.add(box11);
    frame.add(box12);
    frame.add(box13);
    frame.add(box14);
    frame.add(box15);
    frame.add(box16);
    frame.add(box17);
    frame.add(box18);
    frame.add(box19);
    frame.add(box20);
    frame.add(box21);
    frame.add(box22);
    frame.add(box23);
    frame.add(box24);
    frame.add(box25);
    frame.add(panel);

    }

    /**
     *Setting Help Content for User.
     */
    protected void settingHelpContent(){
 frameForHelp.setSize(700,500);
helpArea.setFont(font);
    helpArea.setText(" Press Easy Button to start Easy Game\n" +
" Press Medium Button to start Medium Game\n" +
" Press Hard Button to start Hard Game\n" +
" Enter a Number from 1 to 5 in eacch box\n" +
" Easy & Medium games show Hints\n" +
" Hard Game doesn't contain Hints\n" +
" Medium Game contains a timer for two Minutes\n" +
" Press Check Button for hints and Your Progress\n" +
" Press NewGame Button to proceed to a new Level\n\n" +
"Good Luck");
    
    helpArea.setEditable(false);
    frameForHelp.add(helpArea);    
    frameForHelp.setVisible(true);
    frameForHelp.setResizable(false);
}
    
}
    

