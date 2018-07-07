package semesterproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
/**
 *In this Class, Levels are set Up for Easy, Medium and Hard game.
 */
public class LevelSetter extends Designing {
//all methods are kept protected as we don't need them in the parent classes and
// also we don't want to be accessed by public or the other classes inspite of the child classes
    
    /**
     *Set up Constants for Easy Level1.
     */
    
        
protected void settingConsatantForEasyL1(){//easy1
        
        
box1.setText("1");
box5.setText("5");
box9.setText("3");
box15.setText("2");
box18.setText("4");
box22.setText("1"); 
settingEditability();
                box1.setEditable(false);
                box5.setEditable(false);
                box9.setEditable(false);
                box15.setEditable(false);
                box18.setEditable(false);
                box22.setEditable(false);  }
/**
     *Checker for Easy Level1.
     */
protected void checkingEasyL1(){
          if(!box2.getText().equals("3") )
          {box2.setBackground(Color.red);}
          else if(box2.getText().equals("3") )
         {box2.setBackground(Color.white);}
          if(!box3.getText().equals("2") )
          {box3.setBackground(Color.red);}
          else if(box3.getText().equals("2") )
         {box3.setBackground(Color.white);}
          if(!box4.getText().equals("4") )
          {box4.setBackground(Color.red);}
          else if(box4.getText().equals("4") )
         {box4.setBackground(Color.white);}
          if(!box6.getText().equals("4") )
          {box6.setBackground(Color.red);}
          else if(box6.getText().equals("4") )
         {box6.setBackground(Color.white);}
          if(!box7.getText().equals("2") )
          {box7.setBackground(Color.red);}
          else if(box7.getText().equals("2") )
         {box7.setBackground(Color.white);}
        
          if(!box8.getText().equals("5") )
          {box8.setBackground(Color.red);}
          else if(box8.getText().equals("5") )
         {box8.setBackground(Color.white);}

          if(!box10.getText().equals("1") )
          {box10.setBackground(Color.red);}
          else if(box10.getText().equals("1") )
         {box10.setBackground(Color.white);}
          
          if(!box11.getText().equals("3") )
          {box11.setBackground(Color.red);}
          else if(box11.getText().equals("3") )
         {box11.setBackground(Color.white);}
          
          if(!box12.getText().equals("4") )
          {box12.setBackground(Color.red);}
          else if(box12.getText().equals("4") )
         {box12.setBackground(Color.white);}
          
          if(!box13.getText().equals("1") )
          {box13.setBackground(Color.red);}
          else if(box13.getText().equals("1") )
         {box13.setBackground(Color.white);}
          
          if(!box14.getText().equals("5") )
          {box14.setBackground(Color.red);}
          else if(box14.getText().equals("5") )
         {box14.setBackground(Color.white);}
          
          if(!box16.getText().equals("2") )
          {box16.setBackground(Color.red);}
          else if(box16.getText().equals("2") )
         {box16.setBackground(Color.white);}
          
          if(!box17.getText().equals("5") )
          {box17.setBackground(Color.red);}
          else if(box17.getText().equals("5") )
         {box17.setBackground(Color.white);}
          
          if(!box19.getText().equals("1") )
          {box19.setBackground(Color.red);}
          else if(box19.getText().equals("1") )
         {box19.setBackground(Color.white);}
          
          if(!box20.getText().equals("3") )
          {box20.setBackground(Color.red);}
          else if(box20.getText().equals("3") )
         {box20.setBackground(Color.white);}
         
          if(!box21.getText().equals("5") )
          {box21.setBackground(Color.red);}
          else if(box21.getText().equals("5") )
         {box21.setBackground(Color.white);}
         
          if(!box23.getText().equals("3") )
          {box23.setBackground(Color.red);}
          else if(box23.getText().equals("3") )
         {box23.setBackground(Color.white);}
         
          if(!box24.getText().equals("2") )
          {box24.setBackground(Color.red);}
          else if(box24.getText().equals("2") )
         {box24.setBackground(Color.white);}

    
         
          if(!box25.getText().equals("4") )
          {box25.setBackground(Color.red);}
          else if(box25.getText().equals("4") )
         {box25.setBackground(Color.white);}

     
}
  /**
     *Set up Constants for Easy Level2.
     */
protected void     settingConsatantForEasyL2(){//eas2

box1.setText("1");
box8.setText("3");
box11.setText("4");
box13.setText("2");
box25.setText("5");
settingEditability();

box1.setEditable(false);
box8.setEditable(false);
box11.setEditable(false);
box13.setEditable(false);
box25.setEditable(false);
}
/**
     *Checker for Easy Level2.
     */
protected void checkingEasyL2(){
    
if(! box2.getText().equals("4")){box2.setBackground(Color.red);}
else if (box2.getText().equals("4")){box2.setBackground(Color.white);}
    
if(! box3.getText().equals("5")){box3.setBackground(Color.red);}
else if (box3.getText().equals("5")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("2")){box4.setBackground(Color.red);}
else if (box4.getText().equals("2")){box4.setBackground(Color.white);}
    
if(! box5.getText().equals("3")){box5.setBackground(Color.red);}
else if (box5.getText().equals("3")){box5.setBackground(Color.white);}
    
if(! box6.getText().equals("2")){box6.setBackground(Color.red);}
else if (box6.getText().equals("2")){box6.setBackground(Color.white);}
    
if(! box7.getText().equals("5")){box7.setBackground(Color.red);}
else if (box7.getText().equals("5")){box7.setBackground(Color.white);}
    
if(! box9.getText().equals("1")){box9.setBackground(Color.red);}
else if (box9.getText().equals("1")){box9.setBackground(Color.white);}
    
if(! box10.getText().equals("4")){box10.setBackground(Color.red);}
else if (box10.getText().equals("4")){box10.setBackground(Color.white);}
    
if(! box12.getText().equals("3")){box12.setBackground(Color.red);}
else if (box12.getText().equals("3")){box12.setBackground(Color.white);}
    
if(! box14.getText().equals("5")){box14.setBackground(Color.red);}
else if (box14.getText().equals("5")){box14.setBackground(Color.white);}
    
if(! box15.getText().equals("1")){box15.setBackground(Color.red);}
else if (box15.getText().equals("1")){box15.setBackground(Color.white);}
    
if(! box16.getText().equals("5")){box16.setBackground(Color.red);}
else if (box16.getText().equals("5")){box16.setBackground(Color.white);}
    
if(! box17.getText().equals("1")){box17.setBackground(Color.red);}
else if (box17.getText().equals("1")){box17.setBackground(Color.white);}
    
if(! box18.getText().equals("4")){box18.setBackground(Color.red);}
else if (box18.getText().equals("4")){box18.setBackground(Color.white);}
    
if(! box19.getText().equals("3")){box19.setBackground(Color.red);}
else if (box19.getText().equals("3")){box19.setBackground(Color.white);}
    
if(! box20.getText().equals("2")){box20.setBackground(Color.red);}
else if (box20.getText().equals("2")){box20.setBackground(Color.white);}
    
if(! box21.getText().equals("3")){box21.setBackground(Color.red);}
else if (box21.getText().equals("3")){box21.setBackground(Color.white);}
    
if(! box22.getText().equals("2")){box22.setBackground(Color.red);}
else if (box22.getText().equals("2")){box22.setBackground(Color.white);}
    
if(! box23.getText().equals("1")){box23.setBackground(Color.red);}
else if (box23.getText().equals("1")){box23.setBackground(Color.white);}
    
if(! box24.getText().equals("4")){box24.setBackground(Color.red);}
else if (box24.getText().equals("4")){box24.setBackground(Color.white);}
}
 /**
     *Set up Constants for Easy Level3.
     */
protected void     settingConsatantForEasyL3(){//eas3

box1.setText("1");
box8.setText("1");
box10.setText("3");
box14.setText("1");
box21.setText("2");
box25.setText("5");
settingEditability();

box1.setEditable(false);
box8.setEditable(false);
box10.setEditable(false);
box14.setEditable(false);
box21.setEditable(false);
box25.setEditable(false);
}
/**
     *Checker for Easy Level3.
     */
protected void checkingEasyL3(){
    
if(!box2.getText().equals("3")){box2.setBackground(Color.red);}
else if(box2.getText().equals("3")){box2.setBackground(Color.white);}
    
if(!box3.getText().equals("4")){box3.setBackground(Color.red);}
else if(box3.getText().equals("4")){box3.setBackground(Color.white);}
    
if(!box4.getText().equals("5")){box4.setBackground(Color.red);}
else if(box4.getText().equals("5")){box4.setBackground(Color.white);}
    
if(!box5.getText().equals("2")){box5.setBackground(Color.red);}
else if(box5.getText().equals("2")){box5.setBackground(Color.white);}
    
if(!box6.getText().equals("5")){box6.setBackground(Color.red);}
else if(box6.getText().equals("5")){box6.setBackground(Color.white);}
    
if(!box7.getText().equals("4")){box7.setBackground(Color.red);}
else if(box7.getText().equals("4")){box7.setBackground(Color.white);}
    
if(!box9.getText().equals("2")){box9.setBackground(Color.red);}
else if(box9.getText().equals("2")){box9.setBackground(Color.white);}
    
if(!box11.getText().equals("3")){box11.setBackground(Color.red);}
else if(box11.getText().equals("3")){box11.setBackground(Color.white);}
    
if(!box12.getText().equals("5")){box12.setBackground(Color.red);}
else if(box12.getText().equals("5")){box12.setBackground(Color.white);}
    
if(!box13.getText().equals("2")){box13.setBackground(Color.red);}
else if(box13.getText().equals("2")){box13.setBackground(Color.white);}
    
if(!box15.getText().equals("4")){box15.setBackground(Color.red);}
else if(box15.getText().equals("4")){box15.setBackground(Color.white);}
    
if(!box16.getText().equals("4")){box16.setBackground(Color.red);}
else if(box16.getText().equals("4")){box16.setBackground(Color.white);}
    
if(!box17.getText().equals("2")){box17.setBackground(Color.red);}
else if(box17.getText().equals("2")){box17.setBackground(Color.white);}
    
if(!box18.getText().equals("5")){box18.setBackground(Color.red);}
else if(box18.getText().equals("5")){box18.setBackground(Color.white);}
    
if(!box19.getText().equals("3")){box19.setBackground(Color.red);}
else if(box19.getText().equals("3")){box19.setBackground(Color.white);}
    
if(!box20.getText().equals("1")){box20.setBackground(Color.red);}
else if(box20.getText().equals("1")){box20.setBackground(Color.white);}
    
if(!box22.getText().equals("1")){box22.setBackground(Color.red);}
else if(box22.getText().equals("1")){box22.setBackground(Color.white);}
    
if(!box23.getText().equals("3")){box23.setBackground(Color.red);}
else if(box23.getText().equals("3")){box23.setBackground(Color.white);}
    
if(!box24.getText().equals("4")){box24.setBackground(Color.red);}
else if(box24.getText().equals("4")){box24.setBackground(Color.white);}
}
 /**
     *Set up Constants for Easy Level4.
     */
protected void     settingConsatantForEasyL4(){//eas4

box5.setText("1");
box6.setText("1");
box9.setText("5");
box12.setText("3");
box18.setText("2");
box21.setText("4");
settingEditability();

box5.setEditable(false);
box6.setEditable(false);
box9.setEditable(false);
box12.setEditable(false);
box18.setEditable(false);
box21.setEditable(false);
}
/**
     *Checker for Easy Level4.
     */
protected void checkingEasyL4(){
    
if(! box1.getText().equals("5")){box1.setBackground(Color.red);}
else if (box1.getText().equals("5")){box1.setBackground(Color.white);}
    
if(! box2.getText().equals("4")){box2.setBackground(Color.red);}
else if (box2.getText().equals("4")){box2.setBackground(Color.white);}
    
if(! box3.getText().equals("3")){box3.setBackground(Color.red);}
else if (box3.getText().equals("3")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("2")){box4.setBackground(Color.red);}
else if (box4.getText().equals("2")){box4.setBackground(Color.white);}
    
if(! box7.getText().equals("2")){box7.setBackground(Color.red);}
else if (box7.getText().equals("2")){box7.setBackground(Color.white);}
    
if(! box8.getText().equals("4")){box8.setBackground(Color.red);}
else if (box8.getText().equals("4")){box8.setBackground(Color.white);}
    
if(! box10.getText().equals("3")){box10.setBackground(Color.red);}
else if (box10.getText().equals("3")){box10.setBackground(Color.white);}
    
if(! box11.getText().equals("2")){box11.setBackground(Color.red);}
else if (box11.getText().equals("2")){box11.setBackground(Color.white);}
    
if(! box13.getText().equals("1")){box13.setBackground(Color.red);}
else if (box13.getText().equals("1")){box13.setBackground(Color.white);}
    
if(! box14.getText().equals("4")){box14.setBackground(Color.red);}
else if (box14.getText().equals("4")){box14.setBackground(Color.white);}
    
if(! box15.getText().equals("5")){box15.setBackground(Color.red);}
else if (box15.getText().equals("5")){box15.setBackground(Color.white);}
    
if(! box16.getText().equals("3")){box16.setBackground(Color.red);}
else if (box16.getText().equals("3")){box16.setBackground(Color.white);}
    
if(! box17.getText().equals("5")){box17.setBackground(Color.red);}
else if (box17.getText().equals("5")){box17.setBackground(Color.white);}
    
if(! box19.getText().equals("1")){box19.setBackground(Color.red);}
else if (box19.getText().equals("1")){box19.setBackground(Color.white);}
    
if(! box20.getText().equals("4")){box20.setBackground(Color.red);}
else if (box20.getText().equals("4")){box20.setBackground(Color.white);}
    
if(! box22.getText().equals("1")){box22.setBackground(Color.red);}
else if (box22.getText().equals("1")){box22.setBackground(Color.white);}
    
if(! box23.getText().equals("5")){box23.setBackground(Color.red);}
else if (box23.getText().equals("5")){box23.setBackground(Color.white);}
    
if(! box24.getText().equals("3")){box24.setBackground(Color.red);}
else if (box24.getText().equals("3")){box24.setBackground(Color.white);}
    
if(! box25.getText().equals("2")){box25.setBackground(Color.red);}
else if (box25.getText().equals("2")){box25.setBackground(Color.white);}
}
 /**
     *Set up Constants for Easy Level5.
     */
protected void     settingConsatantForEasyL5(){//eas5

box5.setText("5");
box9.setText("1");
box11.setText("3");
box14.setText("2");
box22.setText("1");
box25.setText("4");
settingEditability();

box5.setEditable(false);
box9.setEditable(false);
box11.setEditable(false);
box14.setEditable(false);
box22.setEditable(false);
box25.setEditable(false);
}
/**
     *Checker for Easy Level5.
     */
protected void checkingEasyL5(){
    
if(! box1.getText().equals("1")){box1.setBackground(Color.red);}
else if (box1.getText().equals("1")){box1.setBackground(Color.white);}
    
if(! box2.getText().equals("3")){box2.setBackground(Color.red);}
else if (box2.getText().equals("3")){box2.setBackground(Color.white);}
    
if(! box3.getText().equals("2")){box3.setBackground(Color.red);}
else if (box3.getText().equals("2")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("4")){box4.setBackground(Color.red);}
else if (box4.getText().equals("4")){box4.setBackground(Color.white);}
    
if(! box6.getText().equals("5")){box6.setBackground(Color.red);}
else if (box6.getText().equals("5")){box6.setBackground(Color.white);}
    
if(! box7.getText().equals("2")){box7.setBackground(Color.red);}
else if (box7.getText().equals("2")){box7.setBackground(Color.white);}
    
if(! box8.getText().equals("4")){box8.setBackground(Color.red);}
else if (box8.getText().equals("4")){box8.setBackground(Color.white);}
    
if(! box10.getText().equals("3")){box10.setBackground(Color.red);}
else if (box10.getText().equals("3")){box10.setBackground(Color.white);}
    
if(! box12.getText().equals("4")){box12.setBackground(Color.red);}
else if (box12.getText().equals("4")){box12.setBackground(Color.white);}
    
if(! box13.getText().equals("5")){box13.setBackground(Color.red);}
else if (box13.getText().equals("5")){box13.setBackground(Color.white);}
    
if(! box15.getText().equals("1")){box15.setBackground(Color.red);}
else if (box15.getText().equals("1")){box15.setBackground(Color.white);}
    
if(! box16.getText().equals("4")){box16.setBackground(Color.red);}
else if (box16.getText().equals("4")){box16.setBackground(Color.white);}
    
if(! box17.getText().equals("5")){box17.setBackground(Color.red);}
else if (box17.getText().equals("5")){box17.setBackground(Color.white);}
    
if(! box18.getText().equals("1")){box18.setBackground(Color.red);}
else if (box18.getText().equals("1")){box18.setBackground(Color.white);}
    
if(! box19.getText().equals("3")){box19.setBackground(Color.red);}
else if (box19.getText().equals("3")){box19.setBackground(Color.white);}
    
if(! box20.getText().equals("2")){box20.setBackground(Color.red);}
else if (box20.getText().equals("2")){box20.setBackground(Color.white);}
    
if(! box21.getText().equals("2")){box21.setBackground(Color.red);}
else if (box21.getText().equals("2")){box21.setBackground(Color.white);}
    
if(! box23.getText().equals("3")){box23.setBackground(Color.red);}
else if (box23.getText().equals("3")){box23.setBackground(Color.white);}
    
if(! box24.getText().equals("5")){box24.setBackground(Color.red);}
else if (box24.getText().equals("5")){box24.setBackground(Color.white);}

}
 /**
     *Set up Constants for Easy Level6.
     */
protected void     settingConsatantForEasyL6(){//eas6

box1.setText("1");
box5.setText("5");
box8.setText("2");
box14.setText("3");
box21.setText("4");
box23.setText("1");
settingEditability();

box1.setEditable(false);
box5.setEditable(false);
box8.setEditable(false);
box14.setEditable(false);
box21.setEditable(false);
box23.setEditable(false);
}
/**
     *Checker for Easy Level6.
     */
protected void checkingEasyL6(){
    
if(! box2.getText().equals("2")){box2.setBackground(Color.red);}
else if (box2.getText().equals("2")){box2.setBackground(Color.white);}
    
if(! box3.getText().equals("3")){box3.setBackground(Color.red);}
else if (box3.getText().equals("3")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("4")){box4.setBackground(Color.red);}
else if (box4.getText().equals("4")){box4.setBackground(Color.white);}
    
if(! box6.getText().equals("5")){box6.setBackground(Color.red);}
else if (box6.getText().equals("5")){box6.setBackground(Color.white);}
    
if(! box7.getText().equals("4")){box7.setBackground(Color.red);}
else if (box7.getText().equals("4")){box7.setBackground(Color.white);}
    
if(! box9.getText().equals("1")){box9.setBackground(Color.red);}
else if (box9.getText().equals("1")){box9.setBackground(Color.white);}
    
if(! box10.getText().equals("3")){box10.setBackground(Color.red);}
else if (box10.getText().equals("3")){box10.setBackground(Color.white);}
    
if(! box11.getText().equals("2")){box11.setBackground(Color.red);}
else if (box11.getText().equals("2")){box11.setBackground(Color.white);}
    
if(! box12.getText().equals("5")){box12.setBackground(Color.red);}
else if (box12.getText().equals("5")){box12.setBackground(Color.white);}
    
if(! box13.getText().equals("4")){box13.setBackground(Color.red);}
else if (box13.getText().equals("4")){box13.setBackground(Color.white);}
    
if(! box15.getText().equals("1")){box15.setBackground(Color.red);}
else if (box15.getText().equals("1")){box15.setBackground(Color.white);}
    
if(! box16.getText().equals("3")){box16.setBackground(Color.red);}
else if (box16.getText().equals("3")){box16.setBackground(Color.white);}
    
if(! box17.getText().equals("1")){box17.setBackground(Color.red);}
else if (box17.getText().equals("1")){box17.setBackground(Color.white);}
    
if(! box18.getText().equals("5")){box18.setBackground(Color.red);}
else if (box18.getText().equals("5")){box18.setBackground(Color.white);}
    
if(! box19.getText().equals("2")){box19.setBackground(Color.red);}
else if (box19.getText().equals("2")){box19.setBackground(Color.white);}
    
if(! box20.getText().equals("4")){box20.setBackground(Color.red);}
else if (box20.getText().equals("4")){box20.setBackground(Color.white);}
    
if(! box22.getText().equals("3")){box22.setBackground(Color.red);}
else if (box22.getText().equals("3")){box22.setBackground(Color.white);}
    
if(! box24.getText().equals("5")){box24.setBackground(Color.red);}
else if (box24.getText().equals("5")){box24.setBackground(Color.white);}
    
if(! box25.getText().equals("2")){box25.setBackground(Color.red);}
else if (box25.getText().equals("2")){box25.setBackground(Color.white);}

}
 /**
     *Set up Constants for Easy Level7.
     */
protected void     settingConsatantForEasyL7(){//eas7

box1.setText("1");
box8.setText("1");
box10.setText("3");
box13.setText("2");
box17.setText("5");
box20.setText("1");
settingEditability();

box1.setEditable(false);
box8.setEditable(false);
box10.setEditable(false);
box13.setEditable(false);
box17.setEditable(false);
box20.setEditable(false);
}
/**
     *Checker for Easy Level7.
     */
protected void checkingEasyL7(){
    
if(! box2.getText().equals("2")){box2.setBackground(Color.red);}
else if (box2.getText().equals("2")){box2.setBackground(Color.white);}
    
if(! box3.getText().equals("3")){box3.setBackground(Color.red);}
else if (box3.getText().equals("3")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("5")){box4.setBackground(Color.red);}
else if (box4.getText().equals("5")){box4.setBackground(Color.white);}
    
if(! box5.getText().equals("4")){box5.setBackground(Color.red);}
else if (box5.getText().equals("4")){box5.setBackground(Color.white);}
    
if(! box6.getText().equals("5")){box6.setBackground(Color.red);}
else if (box6.getText().equals("5")){box6.setBackground(Color.white);}
    
if(! box7.getText().equals("4")){box7.setBackground(Color.red);}
else if (box7.getText().equals("4")){box7.setBackground(Color.white);}
    
if(! box9.getText().equals("2")){box9.setBackground(Color.red);}
else if (box9.getText().equals("2")){box9.setBackground(Color.white);}
    
if(! box11.getText().equals("4")){box11.setBackground(Color.red);}
else if (box11.getText().equals("4")){box11.setBackground(Color.white);}
    
if(! box12.getText().equals("3")){box12.setBackground(Color.red);}
else if (box12.getText().equals("3")){box12.setBackground(Color.white);}
    
if(! box14.getText().equals("1")){box14.setBackground(Color.red);}
else if (box14.getText().equals("1")){box14.setBackground(Color.white);}
    
if(! box15.getText().equals("5")){box15.setBackground(Color.red);}
else if (box15.getText().equals("5")){box15.setBackground(Color.white);}
    
if(! box16.getText().equals("2")){box16.setBackground(Color.red);}
else if (box16.getText().equals("2")){box16.setBackground(Color.white);}
    
if(! box18.getText().equals("4")){box18.setBackground(Color.red);}
else if (box18.getText().equals("4")){box18.setBackground(Color.white);}
    
if(! box19.getText().equals("3")){box19.setBackground(Color.red);}
else if (box19.getText().equals("3")){box19.setBackground(Color.white);}

    
if(! box21.getText().equals("3")){box21.setBackground(Color.red);}
else if (box21.getText().equals("3")){box21.setBackground(Color.white);}
    
if(! box22.getText().equals("1")){box22.setBackground(Color.red);}
else if (box22.getText().equals("1")){box22.setBackground(Color.white);}
    
if(! box23.getText().equals("5")){box23.setBackground(Color.red);}
else if (box23.getText().equals("5")){box23.setBackground(Color.white);}
    
if(! box25.getText().equals("2")){box25.setBackground(Color.red);}
else if (box25.getText().equals("2")){box25.setBackground(Color.white);}

}
 /**
     *Set up Constants for Easy Level8.
     */
protected void     settingConsatantForEasyL8(){//eas8

box1.setText("1");
box8.setText("3");
box10.setText("1");
box16.setText("4");
box23.setText("2");
settingEditability();

box1.setEditable(false);
box8.setEditable(false);
box10.setEditable(false);
box16.setEditable(false);
box23.setEditable(false);
}
/**
     *Checker for Easy Level8.
     */
protected void checkingEasyL8(){
    
if(! box2.getText().equals("5")){box2.setBackground(Color.red);}
else if (box2.getText().equals("5")){box2.setBackground(Color.white);}
    
if(! box3.getText().equals("4")){box3.setBackground(Color.red);}
else if (box3.getText().equals("4")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("3")){box4.setBackground(Color.red);}
else if (box4.getText().equals("3")){box4.setBackground(Color.white);}
    
if(! box5.getText().equals("2")){box5.setBackground(Color.red);}
else if (box5.getText().equals("2")){box5.setBackground(Color.white);}
    
if(! box6.getText().equals("2")){box6.setBackground(Color.red);}
else if (box6.getText().equals("2")){box6.setBackground(Color.white);}
    
if(! box7.getText().equals("4")){box7.setBackground(Color.red);}
else if (box7.getText().equals("4")){box7.setBackground(Color.white);}
    
if(! box9.getText().equals("5")){box9.setBackground(Color.red);}
else if (box9.getText().equals("5")){box9.setBackground(Color.white);}
    
if(! box11.getText().equals("3")){box11.setBackground(Color.red);}
else if (box11.getText().equals("3")){box11.setBackground(Color.white);}
    
if(! box12.getText().equals("2")){box12.setBackground(Color.red);}
else if (box12.getText().equals("2")){box12.setBackground(Color.white);}
    
if(! box13.getText().equals("5")){box13.setBackground(Color.red);}
else if (box13.getText().equals("5")){box13.setBackground(Color.white);}
    
if(! box14.getText().equals("4")){box14.setBackground(Color.red);}
else if (box14.getText().equals("4")){box14.setBackground(Color.white);}
    
if(! box15.getText().equals("1")){box15.setBackground(Color.red);}
else if (box15.getText().equals("1")){box15.setBackground(Color.white);}
    
if(! box17.getText().equals("3")){box17.setBackground(Color.red);}
else if (box17.getText().equals("3")){box17.setBackground(Color.white);}
    
if(! box18.getText().equals("1")){box18.setBackground(Color.red);}
else if (box18.getText().equals("1")){box18.setBackground(Color.white);}
    
if(! box19.getText().equals("2")){box19.setBackground(Color.red);}
else if (box19.getText().equals("2")){box19.setBackground(Color.white);}
    
if(! box20.getText().equals("5")){box20.setBackground(Color.red);}
else if (box20.getText().equals("5")){box20.setBackground(Color.white);}
    
if(! box21.getText().equals("5")){box21.setBackground(Color.red);}
else if (box21.getText().equals("5")){box21.setBackground(Color.white);}
    
if(! box22.getText().equals("4")){box22.setBackground(Color.red);}
else if (box22.getText().equals("4")){box22.setBackground(Color.white);}
    
if(! box24.getText().equals("1")){box24.setBackground(Color.red);}
else if (box24.getText().equals("1")){box24.setBackground(Color.white);}
    
if(! box25.getText().equals("3")){box25.setBackground(Color.red);}
else if (box25.getText().equals("3")){box25.setBackground(Color.white);}

}
 /**
     *Set up Constants for Easy Level9.
     */
protected void     settingConsatantForEasyL9(){//eas9

box5.setText("2");
box9.setText("5");
box12.setText("3");
box17.setText("4");
box20.setText("3");
box21.setText("1");
settingEditability();

box5.setEditable(false);
box9.setEditable(false);
box12.setEditable(false);
box17.setEditable(false);
box20.setEditable(false);
box21.setEditable(false);

}
/**
     *Checker for Easy Level9.
     */
protected void checkingEasyL9(){
    
if(! box1.getText().equals("5")){box1.setBackground(Color.red);}
else if (box1.getText().equals("5")){box1.setBackground(Color.white);}
    
if(! box2.getText().equals("1")){box2.setBackground(Color.red);}
else if (box2.getText().equals("1")){box2.setBackground(Color.white);}
    
if(! box3.getText().equals("3")){box3.setBackground(Color.red);}
else if (box3.getText().equals("3")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("4")){box4.setBackground(Color.red);}
else if (box4.getText().equals("4")){box4.setBackground(Color.white);}
    
if(! box6.getText().equals("3")){box6.setBackground(Color.red);}
else if (box6.getText().equals("3")){box6.setBackground(Color.white);}
    
if(! box7.getText().equals("2")){box7.setBackground(Color.red);}
else if (box7.getText().equals("2")){box7.setBackground(Color.white);}
    
if(! box8.getText().equals("4")){box8.setBackground(Color.red);}
else if (box8.getText().equals("4")){box8.setBackground(Color.white);}
    
if(! box10.getText().equals("1")){box10.setBackground(Color.red);}
else if (box10.getText().equals("1")){box10.setBackground(Color.white);}
    
if(! box11.getText().equals("4")){box11.setBackground(Color.red);}
else if (box11.getText().equals("4")){box11.setBackground(Color.white);}
    
if(! box13.getText().equals("1")){box13.setBackground(Color.red);}
else if (box13.getText().equals("1")){box13.setBackground(Color.white);}
    
if(! box14.getText().equals("2")){box14.setBackground(Color.red);}
else if (box14.getText().equals("2")){box14.setBackground(Color.white);}
    
if(! box15.getText().equals("5")){box15.setBackground(Color.red);}
else if (box15.getText().equals("5")){box15.setBackground(Color.white);}
    
if(! box16.getText().equals("2")){box16.setBackground(Color.red);}
else if (box16.getText().equals("2")){box16.setBackground(Color.white);}
    
if(! box18.getText().equals("5")){box18.setBackground(Color.red);}
else if (box18.getText().equals("5")){box18.setBackground(Color.white);}
    
if(! box19.getText().equals("1")){box19.setBackground(Color.red);}
else if (box19.getText().equals("1")){box19.setBackground(Color.white);}
    
if(! box22.getText().equals("5")){box22.setBackground(Color.red);}
else if (box22.getText().equals("5")){box22.setBackground(Color.white);}
    
if(! box23.getText().equals("2")){box23.setBackground(Color.red);}
else if (box23.getText().equals("2")){box23.setBackground(Color.white);}
    
if(! box24.getText().equals("3")){box24.setBackground(Color.red);}
else if (box24.getText().equals("3")){box24.setBackground(Color.white);}
    
if(! box25.getText().equals("4")){box25.setBackground(Color.red);}
else if (box25.getText().equals("4")){box25.setBackground(Color.white);}

}
 /**
     *Set up Constants for Easy Level10.
     */
protected void     settingConsatantForEasyL10(){//eas10

box2.setText("1");
box5.setText("3");
box8.setText("4");
box14.setText("5");
box15.setText("1");
box22.setText("2");
box24.setText("3");
settingEditability();

box2.setEditable(false);
box5.setEditable(false);
box8.setEditable(false);
box14.setEditable(false);
box15.setEditable(false);
box22.setEditable(false);
box24.setEditable(false);

}
/**
     *Checker for Easy Level10.
     */
protected void checkingEasyL10(){
    
if(! box1.getText().equals("2")){box1.setBackground(Color.red);}
else if (box1.getText().equals("2")){box1.setBackground(Color.white);}
    
if(! box3.getText().equals("5")){box3.setBackground(Color.red);}
else if (box3.getText().equals("5")){box3.setBackground(Color.white);}
    
if(! box4.getText().equals("4")){box4.setBackground(Color.red);}
else if (box4.getText().equals("4")){box4.setBackground(Color.white);}
    
if(! box6.getText().equals("1")){box6.setBackground(Color.red);}
else if (box6.getText().equals("1")){box6.setBackground(Color.white);}
    
if(! box7.getText().equals("3")){box7.setBackground(Color.red);}
else if (box7.getText().equals("3")){box7.setBackground(Color.white);}
    
if(! box9.getText().equals("2")){box9.setBackground(Color.red);}
else if (box9.getText().equals("2")){box9.setBackground(Color.white);}
    
if(! box10.getText().equals("5")){box10.setBackground(Color.red);}
else if (box10.getText().equals("5")){box10.setBackground(Color.white);}

if(! box11.getText().equals("3")){box11.setBackground(Color.red);}
else if (box11.getText().equals("3")){box11.setBackground(Color.white);}
    
if(! box12.getText().equals("4")){box12.setBackground(Color.red);}
else if (box12.getText().equals("4")){box12.setBackground(Color.white);}
    
if(! box13.getText().equals("2")){box13.setBackground(Color.red);}
else if (box13.getText().equals("2")){box13.setBackground(Color.white);}
    
if(! box16.getText().equals("4")){box16.setBackground(Color.red);}
else if (box16.getText().equals("4")){box16.setBackground(Color.white);}
    
if(! box17.getText().equals("5")){box17.setBackground(Color.red);}
else if (box17.getText().equals("5")){box17.setBackground(Color.white);}
    
if(! box18.getText().equals("3")){box18.setBackground(Color.red);}
else if (box18.getText().equals("3")){box18.setBackground(Color.white);}
    
if(! box19.getText().equals("1")){box19.setBackground(Color.red);}
else if (box19.getText().equals("1")){box19.setBackground(Color.white);}
    
if(! box20.getText().equals("2")){box20.setBackground(Color.red);}
else if (box20.getText().equals("2")){box20.setBackground(Color.white);}
    
if(! box21.getText().equals("5")){box21.setBackground(Color.red);}
else if (box21.getText().equals("5")){box21.setBackground(Color.white);}
    
if(! box23.getText().equals("1")){box23.setBackground(Color.red);}
else if (box23.getText().equals("1")){box23.setBackground(Color.white);}
    
if(! box25.getText().equals("4")){box25.setBackground(Color.red);}
else if (box25.getText().equals("4")){box25.setBackground(Color.white);}
 

}
 /**
     *Set up Constants for Hard Level1.
     */
protected void     settingConsatantForHardL1(){//hard1

box3.setText("2");
box8.setText("5");
box15.setText("1");
box23.setText("4");
box25.setText("3");
settingEditability();

box3.setEditable(false);
box8.setEditable(false);
box15.setEditable(false);
box23.setEditable(false);
box25.setEditable(false);

}
/**
     *Checker for Hard Level1.
     */
protected void checkingHardL1(){
     if(box1.getText().equals("3")&&
        box2.getText().equals("1")&&
        box4.getText().equals("4")&&
        box5.getText().equals("5")&&
        box6.getText().equals("2")&&
        box7.getText().equals("3")&&
        box9.getText().equals("1")&&
        box10.getText().equals("4")&&
        box11.getText().equals("4")&&
        box12.getText().equals("5")&&
        box13.getText().equals("3")&&
        box14.getText().equals("2")&&
        box16.getText().equals("5")&&
        box17.getText().equals("4")&&
        box18.getText().equals("1")&&
        box19.getText().equals("3")&&
        box20.getText().equals("2")&&
        box21.getText().equals("1")&&
        box22.getText().equals("2")&&
        box24.getText().equals("5")
             )  
             
          {JOptionPane.showMessageDialog(null,"good");}
     else          {JOptionPane.showMessageDialog(object,"Complete the Challenge Correctly!","WARNING",JOptionPane.WARNING_MESSAGE);}

}
        /**
     *Set up Constants for Hard Level2.
     */
protected void     settingConsatantForHardL2(){//hard2

box8.setText("5");
box11.setText("3");
box13.setText("2");
box15.setText("4");
box18.setText("1");
settingEditability();

box8.setEditable(false);
box11.setEditable(false);
box13.setEditable(false);
box18.setEditable(false);
box15.setEditable(false);

}
/**
     *Checker for Hard Level2.
     */
protected void checkingHardL2(){
     if(box1.getText().equals("5")&&
        box2.getText().equals("4")&&
        box3.getText().equals("3")&&
        box4.getText().equals("2")&&
        box5.getText().equals("1")&&
        box6.getText().equals("1")&&
        box7.getText().equals("2")&&
      box9.getText().equals("4")&&
        box10.getText().equals("3")&&
        box12.getText().equals("1")&&
        box14.getText().equals("5")&&
        box16.getText().equals("4")&&
             
        box17.getText().equals("5")&&
        box19.getText().equals("3")&&
        box20.getText().equals("2")&&
        box21.getText().equals("2")&&
        box22.getText().equals("3")&&
             box23.getText().equals("4")&&
        box24.getText().equals("1")&&
        box25.getText().equals("5"))
               {JOptionPane.showMessageDialog(null,"good");}
     else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

         }
/**
     *Set up Constants for Hard Level3.
     */
protected void     settingConsatantForHardL3(){//hard3

box8.setText("5");
box11.setText("3");
box14.setText("2");
box15.setText("1");
settingEditability();

box8.setEditable(false);
box11.setEditable(false);
box14.setEditable(false);
box15.setEditable(false);

}
/**
     *Checker for Hard Level3.
     */ 
protected void checkingHardL3(){
     if(box1.getText().equals("4")&&
        box2.getText().equals("2")&&
         box3.getText().equals("3")&&
        box4.getText().equals("1")&&
        box5.getText().equals("5")&&
        box6.getText().equals("1")&&
        box8.getText().equals("2")&&
        box9.getText().equals("3")&&
        box10.getText().equals("4")&&
        box12.getText().equals("4")&&
        box13.getText().equals("5")&&
       
        box16.getText().equals("5")&&
        box17.getText().equals("3")&&
        box18.getText().equals("1")&&
        box19.getText().equals("4")&&
        box20.getText().equals("2")&&
        box21.getText().equals("2")&&
        box22.getText().equals("1")&&
        box23.getText().equals("4")&&
         box24.getText().equals("5")&&
        box25.getText().equals("3"))
                   {JOptionPane.showMessageDialog(null,"good");}
     else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

             }
/**
     *Set up Constants for Hard Level4.
     */
protected void     settingConsatantForHardL4(){//hard4

box1.setText("1");
box5.setText("4");
box8.setText("5");
box15.setText("1");
box18.setText("2");
box21.setText("3");
settingEditability();

box1.setEditable(false);
box5.setEditable(false);
box8.setEditable(false);
box15.setEditable(false);
box18.setEditable(false);
box21.setEditable(false);

}
/**
     *Checker for Hard Level4.
     */
protected void checkingHardL4(){
     if(box1.getText().equals("1")&&
        box2.getText().equals("5")&&
        box3.getText().equals("3")&&

        box4.getText().equals("2")&&
        box5.getText().equals("4")&&
        box6.getText().equals("2")&&
        box7.getText().equals("1")&&
        box9.getText().equals("4")&&
        box10.getText().equals("3")&&
        box11.getText().equals("5")&&
        box12.getText().equals("2")&&
        box13.getText().equals("4")&&
        box14.getText().equals("3")&&
        box16.getText().equals("4")&&
        box17.getText().equals("3")&&
        box19.getText().equals("1")&&
        box20.getText().equals("5")&&
        box22.getText().equals("4")&&
        box23.getText().equals("1")&&
        box24.getText().equals("5")&&
                   box25.getText().equals("2"))
            {JOptionPane.showMessageDialog(null,"good");}
     else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

         
         }
/**
     *Set up Constants for Hard Level5.
     */
protected void     settingConsatantForHardL5(){//hard5

box5.setText("1");
box7.setText("2");
box13.setText("3");
box14.setText("2");
box17.setText("5");
box21.setText("4");
box25.setText("3");
settingEditability();

box5.setEditable(false);
box7.setEditable(false);
box13.setEditable(false);
box14.setEditable(false);
box17.setEditable(false);
box21.setEditable(false);
box25.setEditable(false);

}
/**
     *Checker for Hard Level5.
     */
protected void checkingHardL5(){
     if(box1.getText().equals("2")&&
        box2.getText().equals("3")&&
        box3.getText().equals("5")&&
        box4.getText().equals("4")&&
        box6.getText().equals("5")&&
        box8.getText().equals("1")&&
        box9.getText().equals("3")&&
        box10.getText().equals("4")&&
        box11.getText().equals("1")&&
        box12.getText().equals("4")&&
        box15.getText().equals("5")&&
        box16.getText().equals("3")&&
        box18.getText().equals("4")&&
        box19.getText().equals("1")&&
        box20.getText().equals("2")&&
        box22.getText().equals("1")&&
        box23.getText().equals("2")&&
        box24.getText().equals("5"))
                   {JOptionPane.showMessageDialog(null,"good");}
     else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

}
/**
     *Set up Constants for Hard Level6.
     */
protected void     settingConsatantForHardL6(){//hard6

box1.setText("1");
box5.setText("4");
box7.setText("3");
box13.setText("2");
box19.setText("5");
box22.setText("1");
settingEditability();

box1.setEditable(false);
box5.setEditable(false);
box7.setEditable(false);
box13.setEditable(false);
box19.setEditable(false);
box22.setEditable(false);

}
/**
     *Checker for Hard Level6.
     */
protected void checkingHardL6(){
     if(box2.getText().equals("5")&&
        box3.getText().equals("3")&&
        box4.getText().equals("2")&&
        box6.getText().equals("2")&&
        box8.getText().equals("1")&&
        box9.getText().equals("4")&&
        box10.getText().equals("5")&&
        box11.getText().equals("5")&&
        box12.getText().equals("4")&&
        box14.getText().equals("1")&&
        box15.getText().equals("3")&&
        box16.getText().equals("3")&&
        box17.getText().equals("2")&&
        box18.getText().equals("4")&&
        box20.getText().equals("1")&&
        box21.getText().equals("4")&&
        box23.getText().equals("5")&&
        box24.getText().equals("3")&&
        box25.getText().equals("2"))
                   {JOptionPane.showMessageDialog(null,"good");}
          else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

}
/**
     *Set up Constants for Hard Level7.
     */
protected void     settingConsatantForHardL7(){//hard7

box3.setText("4");
box9.setText("1");
box14.setText("3");
box18.setText("5");
box20.setText("2");
box21.setText("5");
settingEditability();

box3.setEditable(false);
box9.setEditable(false);
box14.setEditable(false);
box18.setEditable(false);
box20.setEditable(false);
box21.setEditable(false);

}
/**
     *Checker for Hard Level7.
     */
protected void checkingHardL7(){
     if(box1.getText().equals("2")&&
        box2.getText().equals("3")&&
        box4.getText().equals("5")&&
        box5.getText().equals("1")&&
        box6.getText().equals("4")&&
        box7.getText().equals("2")&&
        box8.getText().equals("3")&&
        box10.getText().equals("5")&&
        box11.getText().equals("1")&&
        box12.getText().equals("5")&&
        box13.getText().equals("2")&&
        box15.getText().equals("4")&&
        box16.getText().equals("3")&&
        box17.getText().equals("1")&&
        box19.getText().equals("4")&&
        box22.getText().equals("4")&&
        box23.getText().equals("1")&&
        box24.getText().equals("2")&&
        box25.getText().equals("3"))
                   {JOptionPane.showMessageDialog(null,"good");}
          else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

}
/**
     *Set up Constants for Hard Level8.
     */
protected void     settingConsatantForHardL8(){//hard8

box5.setText("5");
box8.setText("4");
box9.setText("5");
box14.setText("4");
box19.setText("2");
box24.setText("3");
settingEditability();

box5.setEditable(false);
box8.setEditable(false);
box9.setEditable(false);
box14.setEditable(false);
box19.setEditable(false);
box24.setEditable(false);

}
/**
     *Checker for Hard Level8.
     */
protected void checkingHardL8(){
     if(box1.getText().equals("4")&&
        box2.getText().equals("3")&&
        box3.getText().equals("2")&&
        box4.getText().equals("1")&&
        box6.getText().equals("3")&&
        box7.getText().equals("2")&&
        box10.getText().equals("1")&&
        box11.getText().equals("1")&&
        box12.getText().equals("5")&&
        box13.getText().equals("3")&&
        box15.getText().equals("2")&&
        box16.getText().equals("5")&&
        box17.getText().equals("4")&&
        box18.getText().equals("1")&&
        box20.getText().equals("3")&&
        box21.getText().equals("2")&&
        box22.getText().equals("1")&&
        box23.getText().equals("5")&&
        box25.getText().equals("4"))
                   {JOptionPane.showMessageDialog(null,"good");}
          else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

}
/**
     *Set up Constants for Hard Level9.
     */
protected void     settingConsatantForHardL9(){//hard9

box3.setText("3");
box13.setText("5");
box15.setText("2");
box22.setText("2");
settingEditability();

box3.setEditable(false);
box13.setEditable(false);
box15.setEditable(false);
box22.setEditable(false);

}
/**
     *Checker for Hard Level9.
     */
protected void checkingHardL9(){
     if(box1.getText().equals("2")&&
        box2.getText().equals("4")&&
        box4.getText().equals("5")&&
        box5.getText().equals("1")&&
        box6.getText().equals("1")&&
        box7.getText().equals("5")&&
        box8.getText().equals("4")&&
       box9.getText().equals("2")&&
        box10.getText().equals("3")&&
        box11.getText().equals("4")&&
        box12.getText().equals("3")&&
        box14.getText().equals("1")&&
        box16.getText().equals("5")&&
        box17.getText().equals("1")&&
        box18.getText().equals("2")&&
        box19.getText().equals("3")&&
        box20.getText().equals("4")&&
        box21.getText().equals("3")&&
        box23.getText().equals("1")&&
        box24.getText().equals("4")&&
        box25.getText().equals("5"))
                   {JOptionPane.showMessageDialog(null,"good");}
          else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

}
/**
     *Set up Constants for Hard Level0.
     */
protected void     settingConsatantForHardL10(){//hard10

box3.setText("4");
box9.setText("5");
box13.setText("2");
box15.setText("3");
box17.setText("1");
settingEditability();

box3.setEditable(false);
box9.setEditable(false);
box13.setEditable(false);
box15.setEditable(false);
box17.setEditable(false);

}
/**
     *Checker for Hard Level10.
     */
protected void checkingHardL10(){
     if(box1.getText().equals("1")&&
        box2.getText().equals("5")&&
        box4.getText().equals("3")&&
        box5.getText().equals("2")&&
        box6.getText().equals("2")&&
        box7.getText().equals("3")&&
        box5.getText().equals("1")&&
        box10.getText().equals("4")&&
        box11.getText().equals("5")&&
        box12.getText().equals("4")&&
        box14.getText().equals("1")&&
        box16.getText().equals("4")&&
        box18.getText().equals("3")&&
        box19.getText().equals("2")&&
        box20.getText().equals("5")&&
        box21.getText().equals("3")&&
        box22.getText().equals("2")&&
        box23.getText().equals("5")&&
         box24.getText().equals("4")&&
         box25.getText().equals("1"))
          {JOptionPane.showMessageDialog(null,"Challenge Completed! Continue playing");}
     else          {JOptionPane.showMessageDialog(null,"Complete the Challenge Correctly!");}

             
         }
/**
     *Set up Constants for Medium Level1.
     */
protected void     settingConsatantForMediumL1(){//medium1

box1.setText("1");
box5.setText("3");
box8.setText("2");
box13.setText("5");
box16.setText("4");
box25.setText("2");

settingEditability();

box1.setEditable(false);
box5.setEditable(false);
box8.setEditable(false);
box13.setEditable(false);
box16.setEditable(false);
box25.setEditable(false);

}
/**
     *Checker for Medium Level1.
     */
protected void checkingMediumL1(){
    if(!box2.getText().equals("2")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("2")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("4")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("4")) {box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("5")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("5")){box4.setBackground(Color.white);}
    
    if(!box6.getText().equals("3")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("3")){box6.setBackground(Color.white);}
    
    if(!box7.getText().equals("4")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("4")){box7.setBackground(Color.white);}
    
    if(!box9.getText().equals("1")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("1")){box9.setBackground(Color.white);}
    
    if(!box10.getText().equals("5")){box10.setBackground(Color.red);}
    else if(box10.getText().equals("5")){box10.setBackground(Color.white);}
    
    if(!box11.getText().equals("2")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("2")){box11.setBackground(Color.white);}
    
    if(!box12.getText().equals("1")){box12.setBackground(Color.red);}
    else if(box12.getText().equals("1")){box12.setBackground(Color.white);}
    
    if(!box14.getText().equals("3")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("3")) {box14.setBackground(Color.white);}
    
    if(!box15.getText().equals("4")) {box15.setBackground(Color.red);}
    else if(box15.getText().equals("4")) {box15.setBackground(Color.white);}
    
    if(!box17.getText().equals("5")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("5")){box17.setBackground(Color.white);}
    
    if(!box18.getText().equals("3")){box18.setBackground(Color.red);}
    else if(box18.getText().equals("3")){box18.setBackground(Color.white);}
    
    if(!box19.getText().equals("2")){box19.setBackground(Color.red);}
    else if(box19.getText().equals("2")){box19.setBackground(Color.white);}
    
    if(!box20.getText().equals("1")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("1")){box20.setBackground(Color.white);}
    
    if(!box21.getText().equals("5")){box21.setBackground(Color.red);}
    else if(box21.getText().equals("5")){box21.setBackground(Color.white);}
    
    if(!box22.getText().equals("3")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("3")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("1")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("1")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("4")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("4")){box24.setBackground(Color.white);}

    }
	

/**
     *Set up Constants for Medium Level2.
     */
protected void     settingConsatantForMediumL2(){//medium2

box1.setText("1");
box5.setText("3");
box12.setText("2");
box19.setText("4");
box21.setText("5");
settingEditability();

box1.setEditable(false);
box5.setEditable(false);
box12.setEditable(false);
box19.setEditable(false);
box21.setEditable(false);

}
/**
     *Checker for Medium Level2.
     */
protected void checkingMediumL2(){
    if(!box2.getText().equals("4")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("4")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("5")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("5")) {box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("2")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("2")){box4.setBackground(Color.white);}
    
    if(!box6.getText().equals("2")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("2")){box6.setBackground(Color.white);}
    
    if(!box7.getText().equals("3")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("3")){box7.setBackground(Color.white);}
       
    if(!box8.getText().equals("4")){box8.setBackground(Color.red);}
    else if(box8.getText().equals("4")){box8.setBackground(Color.white);}
    
    
    if(!box9.getText().equals("5")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("5")){box9.setBackground(Color.white);}
    
    if(!box10.getText().equals("1")){box10.setBackground(Color.red);}
    else if(box10.getText().equals("1")){box10.setBackground(Color.white);}
    
    if(!box11.getText().equals("4")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("4")){box11.setBackground(Color.white);}
    
    if(!box13.getText().equals("3")){box13.setBackground(Color.red);}
    else if(box13.getText().equals("3")){box13.setBackground(Color.white);}
    
    if(!box14.getText().equals("1")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("1")) {box14.setBackground(Color.white);}
    
    if(!box15.getText().equals("5")) {box15.setBackground(Color.red);}
    else if(box15.getText().equals("5")) {box15.setBackground(Color.white);}
    
    if(!box16.getText().equals("3")) {box16.setBackground(Color.red);}
    else if(box16.getText().equals("3")) {box16.setBackground(Color.white);}
    
    if(!box17.getText().equals("5")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("5")){box17.setBackground(Color.white);}
    
    if(!box18.getText().equals("1")){box18.setBackground(Color.red);}
    else if(box18.getText().equals("1")){box18.setBackground(Color.white);}
    
    
    if(!box20.getText().equals("2")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("2")){box20.setBackground(Color.white);}
    
   
    if(!box22.getText().equals("1")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("1")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("2")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("2")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("3")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("3")){box24.setBackground(Color.white);}
    
    if(!box25.getText().equals("4")) {box25.setBackground(Color.red);}
    else if(box25.getText().equals("4")) {box25.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level3.
     */
protected void     settingConsatantForMediumL3(){//medium3

box2.setText("1");
box10.setText("5");
box12.setText("3");
box16.setText("1");
box20.setText("4");
box22.setText("2");
settingEditability();

box2.setEditable(false);
box10.setEditable(false);
box12.setEditable(false);
box16.setEditable(false);
box20.setEditable(false);
box22.setEditable(false);

}
/**
     *Checker for Medium Level3.
     */
protected void checkingMediumL3(){
    if(!box1.getText().equals("3")) {box1.setBackground(Color.red);}
    else if( box1.getText().equals("3")) {box1.setBackground(Color.white);}
    
    if(!box3.getText().equals("5")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("5")) {box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("4")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("4")){box4.setBackground(Color.white);}
    
    if(!box6.getText().equals("2")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("2")){box6.setBackground(Color.white);}
    
    if(!box7.getText().equals("4")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("4")){box7.setBackground(Color.white);}
    
     if(!box8.getText().equals("1")){box8.setBackground(Color.red);}
    else if(box8.getText().equals("1")){box8.setBackground(Color.white);}
    
    if(!box9.getText().equals("3")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("3")){box9.setBackground(Color.white);}
    
    
    if(!box11.getText().equals("4")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("4")){box11.setBackground(Color.white);}
    
    if(!box13.getText().equals("2")){box13.setBackground(Color.red);}
    else if(box13.getText().equals("2")){box13.setBackground(Color.white);}
    
    if(!box14.getText().equals("5")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("5")) {box14.setBackground(Color.white);}
    
    if(!box15.getText().equals("1")) {box15.setBackground(Color.red);}
    else if(box15.getText().equals("1")) {box15.setBackground(Color.white);}
    
    if(!box17.getText().equals("5")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("5")){box17.setBackground(Color.white);}
    
    if(!box18.getText().equals("3")){box18.setBackground(Color.red);}
    else if(box18.getText().equals("3")){box18.setBackground(Color.white);}
    
    if(!box19.getText().equals("2")){box19.setBackground(Color.red);}
    else if(box19.getText().equals("2")){box19.setBackground(Color.white);}
    
    if(!box21.getText().equals("5")){box21.setBackground(Color.red);}
    else if(box21.getText().equals("5")){box21.setBackground(Color.white);}
    
   
    if(!box23.getText().equals("4")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("4")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("1")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("1")){box24.setBackground(Color.white);}
    
     if(!box25.getText().equals("3")){box25.setBackground(Color.red);}
    else if(box25.getText().equals("3")){box25.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level4.
     */
protected void     settingConsatantForMediumL4(){//medium4

box1.setText("1");
box10.setText("3");
box12.setText("4");
box18.setText("5");
box21.setText("3");
box25.setText("2");
settingEditability();

box1.setEditable(false);
box10.setEditable(false);
box12.setEditable(false);
box18.setEditable(false);
box21.setEditable(false);
box25.setEditable(false);

}
/**
     *Checker for Medium Level4.
     */
protected void checkingMediumL4(){
    if(!box2.getText().equals("2")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("2")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("4")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("4")) {box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("3")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("3")){box4.setBackground(Color.white);}
    
     if(!box5.getText().equals("5")){box5.setBackground(Color.red);}
    else if(box5.getText().equals("5")){box5.setBackground(Color.white);}
    
    if(!box6.getText().equals("4")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("4")){box6.setBackground(Color.white);}
    
    if(!box7.getText().equals("1")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("1")){box7.setBackground(Color.white);}
    
     if(!box8.getText().equals("2")){box8.setBackground(Color.red);}
    else if(box8.getText().equals("2")){box8.setBackground(Color.white);}
    
    if(!box9.getText().equals("5")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("5")){box9.setBackground(Color.white);}
    
   
    if(!box11.getText().equals("5")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("5")){box11.setBackground(Color.white);}
    
    if(!box13.getText().equals("3")){box13.setBackground(Color.red);}
    else if(box13.getText().equals("3")){box13.setBackground(Color.white);}
    
    if(!box14.getText().equals("2")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("2")) {box14.setBackground(Color.white);}
    
    if(!box15.getText().equals("1")) {box15.setBackground(Color.red);}
    else if(box15.getText().equals("1")) {box15.setBackground(Color.white);}
    
    if(!box16.getText().equals("2")){box16.setBackground(Color.red);}
    else if(box16.getText().equals("2")){box1.setBackground(Color.white);}
    
    if(!box17.getText().equals("3")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("3")){box17.setBackground(Color.white);}
    
    if(!box19.getText().equals("1")){box19.setBackground(Color.red);}
    else if(box19.getText().equals("1")){box19.setBackground(Color.white);}
    
    if(!box20.getText().equals("4")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("4")){box20.setBackground(Color.white);}
    
    
    if(!box22.getText().equals("5")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("5")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("1")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("1")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("4")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("4")){box24.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level5.
     */
protected void     settingConsatantForMediumL5(){//medium5

box5.setText("4");
box8.setText("5");
box10.setText("1");
box12.setText("2");
box16.setText("3");
box19.setText("2");
settingEditability();

box5.setEditable(false);
box8.setEditable(false);
box10.setEditable(false);
box12.setEditable(false);
box16.setEditable(false);
box19.setEditable(false);

}
/**
     *Checker for Medium Level5.
     */
protected void checkingMediumL5(){
     if(!box1.getText().equals("1")){box1.setBackground(Color.red);}
    else if(box1.getText().equals("1")){box1.setBackground(Color.white);}
    
    if(!box2.getText().equals("5")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("5")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("2")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("2")) {box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("3")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("3")){box4.setBackground(Color.white);}
    
    if(!box6.getText().equals("2")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("2")){box6.setBackground(Color.white);}
    
    if(!box7.getText().equals("3")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("3")){box7.setBackground(Color.white);}
    
    if(!box9.getText().equals("4")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("4")){box9.setBackground(Color.white);}
    
    
    if(!box11.getText().equals("4")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("4")){box11.setBackground(Color.white);}
    
    if(!box13.getText().equals("1")){box13.setBackground(Color.red);}
    else if(box13.getText().equals("1")){box13.setBackground(Color.white);}
    
    if(!box14.getText().equals("5")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("5")) {box14.setBackground(Color.white);}
    
    if(!box15.getText().equals("3")) {box15.setBackground(Color.red);}
    else if(box15.getText().equals("3")) {box15.setBackground(Color.white);}
    
    if(!box17.getText().equals("1")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("1")){box17.setBackground(Color.white);}
    
    if(!box18.getText().equals("4")){box18.setBackground(Color.red);}
    else if(box18.getText().equals("4")){box18.setBackground(Color.white);}
    
    if(!box20.getText().equals("5")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("5")){box20.setBackground(Color.white);}
    
    if(!box21.getText().equals("5")){box21.setBackground(Color.red);}
    else if(box21.getText().equals("5")){box21.setBackground(Color.white);}
    
    if(!box22.getText().equals("4")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("4")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("3")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("3")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("1")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("1")){box24.setBackground(Color.white);}
    
     if(!box25.getText().equals("2")){box25.setBackground(Color.red);}
    else if(box25.getText().equals("2")){box25.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level6.
     */
protected void     settingConsatantForMediumL6(){//medium6

box1.setText("1");
box8.setText("5");
box9.setText("3");
box12.setText("4");
box19.setText("2");
box21.setText("2");
box25.setText("3");
settingEditability();

box1.setEditable(false);
box8.setEditable(false);
box9.setEditable(false);
box12.setEditable(false);
box19.setEditable(false);
box21.setEditable(false);
box25.setEditable(false);

}
/**
     *Checker for Medium Level6.
     */
protected void checkingMediumL6(){
    if(!box2.getText().equals("2")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("2")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("3")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("3")){  box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("4")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("4")){box4.setBackground(Color.white);}
    
    if(!box5.getText().equals("5")){box5.setBackground(Color.red);}
    else if(box5.getText().equals("5")){box5.setBackground(Color.white);}
    
    if(!box6.getText().equals("4")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("4")){box6.setBackground(Color.white);}
    
    if(!box7.getText().equals("1")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("1")){box7.setBackground(Color.white);}
    
    
    if(!box10.getText().equals("2")){box10.setBackground(Color.red);}
    else if(box10.getText().equals("2")){box10.setBackground(Color.white);}
    
    if(!box11.getText().equals("3")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("3")){box11.setBackground(Color.white);}
    
    if(!box13.getText().equals("2")){box13.setBackground(Color.red);}
    else if(box13.getText().equals("2")){box13.setBackground(Color.white);}
    
    if(!box14.getText().equals("5")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("5")) {box14.setBackground(Color.white);}
    
    if(!box15.getText().equals("1")) {box15.setBackground(Color.red);}
    else if(box15.getText().equals("1")) {box15.setBackground(Color.white);}
    
    if(!box16.getText().equals("5")){box16.setBackground(Color.red);}
    else if(box16.getText().equals("5")){box16.setBackground(Color.white);}
    
    if(!box17.getText().equals("3")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("3")){box17.setBackground(Color.white);}
    
    if(!box18.getText().equals("1")){box18.setBackground(Color.red);}
    else if(box18.getText().equals("1")){box18.setBackground(Color.white);}
    
    if(!box20.getText().equals("4")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("4")){box20.setBackground(Color.white);}
   
    if(!box22.getText().equals("5")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("5")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("4")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("4")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("1")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("1")){box24.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level7.
     */
protected void     settingConsatantForMediumL7(){//medium7

box7.setText("4");
box13.setText("3");
box15.setText("2");
box16.setText("5");
box18.setText("1");
settingEditability();

box7.setEditable(false);
box13.setEditable(false);
box15.setEditable(false);
box16.setEditable(false);
box18.setEditable(false);

}
/**
     *Checker for Medium Level7.
     */
protected void checkingMediumL7(){
    
    if(!box1.getText().equals("3")){box1.setBackground(Color.red);}
    else if(box1.getText().equals("3")){box1.setBackground(Color.white);}
    
    if(!box2.getText().equals("5")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("5")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("4")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("4")) {box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("2")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("2")){box4.setBackground(Color.white);}
    
    if(!box5.getText().equals("1")){box5.setBackground(Color.red);}
    else if(box5.getText().equals("1")){box5.setBackground(Color.white);}
    
    if(!box6.getText().equals("2")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("2")){box6.setBackground(Color.white);}
    
    if(!box8.getText().equals("5")){box8.setBackground(Color.red);}
    else if(box8.getText().equals("5")){box8.setBackground(Color.white);}
    
    if(!box9.getText().equals("1")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("1")){box9.setBackground(Color.white);}
    
    if(!box10.getText().equals("3")){box10.setBackground(Color.red);}
    else if(box10.getText().equals("3")){box10.setBackground(Color.white);}
    
    if(!box11.getText().equals("4")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("4")){box11.setBackground(Color.white);}
    
    if(!box12.getText().equals("1")){box12.setBackground(Color.red);}
    else if(box12.getText().equals("1")){box12.setBackground(Color.white);}
    
    if(!box14.getText().equals("5")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("5")) {box14.setBackground(Color.white);}
   
    if(!box17.getText().equals("2")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("2")){box17.setBackground(Color.white);}
    
    if(!box19.getText().equals("3")){box19.setBackground(Color.red);}
    else if(box19.getText().equals("3")){box19.setBackground(Color.white);}
    
    if(!box20.getText().equals("4")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("4")){box20.setBackground(Color.white);}
    
    if(!box21.getText().equals("1")){box21.setBackground(Color.red);}
    else if(box21.getText().equals("1")){box21.setBackground(Color.white);}
    
    if(!box22.getText().equals("3")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("3")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("2")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("2")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("4")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("4")){box24.setBackground(Color.white);}
    
    if(!box25.getText().equals("5")){box25.setBackground(Color.red);}
    else if(box25.getText().equals("5")){box25.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level8.
     */
protected void     settingConsatantForMediumL8(){//medium8

box4.setText("1");
box6.setText("5");
box10.setText("3");
box14.setText("4");
box18.setText("2");
box21.setText("2");
settingEditability();

box4.setEditable(false);
box6.setEditable(false);
box10.setEditable(false);
box14.setEditable(false);
box18.setEditable(false);
box21.setEditable(false);

}
/**
     *Checker for Medium Level8.
     */
protected void checkingMediumL8(){
    if(!box1.getText().equals("4")){box1.setBackground(Color.red);}
    else if(box1.getText().equals("4")){box1.setBackground(Color.white);}
    
    if(!box2.getText().equals("2")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("2")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("3")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("3")) {box3.setBackground(Color.white);}    
    if(!box5.getText().equals("5")){box5.setBackground(Color.red);}
    else if(box5.getText().equals("5")){box5.setBackground(Color.white);}
    
    if(!box6.getText().equals("1")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("1")){box6.setBackground(Color.white);}
    
    if(!box8.getText().equals("4")){box8.setBackground(Color.red);}
    else if(box8.getText().equals("4")){box8.setBackground(Color.white);}
    
    if(!box9.getText().equals("2")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("2")){box9.setBackground(Color.white);}
    
    
    if(!box11.getText().equals("3")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("3")){box11.setBackground(Color.white);}
    
    if(!box12.getText().equals("1")){box12.setBackground(Color.red);}
    else if(box12.getText().equals("1")){box12.setBackground(Color.white);}
    
    if(!box13.getText().equals("5")) {box13.setBackground(Color.red);}
    else if( box13.getText().equals("5")) {box13.setBackground(Color.white);}
    
    if(!box15.getText().equals("2")) {box15.setBackground(Color.red);}
    else if(box15.getText().equals("2")) {box15.setBackground(Color.white);}
    
    if(!box16.getText().equals("5")){box16.setBackground(Color.red);}
    else if(box16.getText().equals("5")){box16.setBackground(Color.white);}
    
    if(!box17.getText().equals("4")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("4")){box17.setBackground(Color.white);}
    
    if(!box19.getText().equals("3")){box19.setBackground(Color.red);}
    else if(box19.getText().equals("3")){box19.setBackground(Color.white);}
    
    if(!box20.getText().equals("1")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("1")){box20.setBackground(Color.white);}
    
    
    if(!box22.getText().equals("3")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("3")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("1")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("1")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("5")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("5")){box24.setBackground(Color.white);}
    
    if(!box25.getText().equals("4")){box25.setBackground(Color.red);}
    else if(box25.getText().equals("4")){box25.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level9.
     */
protected void     settingConsatantForMediumL9(){//medium9

box6.setText("2");
box15.setText("5");
box18.setText("3");
box21.setText("4");
box25.setText("1");
settingEditability();

box6.setEditable(false);
box15.setEditable(false);
box18.setEditable(false);
box21.setEditable(false);
box25.setEditable(false);

}
/**
     *Checker for Medium Level9.
     */
protected void checkingMediumL9(){
    if(!box1.getText().equals("5")){box1.setBackground(Color.red);}
    else if(box1.getText().equals("5")){box1.setBackground(Color.white);}
    
    if(!box2.getText().equals("2")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("2")) {box2.setBackground(Color.white);}
    
    if(!box3.getText().equals("1")) {box3.setBackground(Color.red);}
    else if(box3.getText().equals("1")) {box3.setBackground(Color.white);}
    
    if(!box4.getText().equals("3")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("3")){box4.setBackground(Color.white);}
    
    if(!box5.getText().equals("4")){box5.setBackground(Color.red);}
    else if(box5.getText().equals("4")){box5.setBackground(Color.white);}
    
    
    if(!box7.getText().equals("4")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("4")){box7.setBackground(Color.white);}
    
    if(!box8.getText().equals("5")){box8.setBackground(Color.red);}
    else if(box8.getText().equals("5")){box8.setBackground(Color.white);}
    
    if(!box9.getText().equals("1")){box9.setBackground(Color.red);}
    else if(box9.getText().equals("1")){box9.setBackground(Color.white);}
    
    if(!box10.getText().equals("3")){box10.setBackground(Color.red);}
    else if(box10.getText().equals("3")){box10.setBackground(Color.white);}
    
    if(!box11.getText().equals("3")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("3")){box11.setBackground(Color.white);}
    
    if(!box12.getText().equals("1")){box12.setBackground(Color.red);}
    else if(box12.getText().equals("1")){box12.setBackground(Color.white);}
    
    if(!box13.getText().equals("4")) {box13.setBackground(Color.red);}
    else if(box13.getText().equals("4")) {box13.setBackground(Color.white);}
    
    if(!box14.getText().equals("2")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("2")) {box14.setBackground(Color.white);}
    
    if(!box16.getText().equals("1")) {box16.setBackground(Color.red);}
    else if(box16.getText().equals("1")) {box16.setBackground(Color.white);}
    
    if(!box17.getText().equals("5")){box17.setBackground(Color.red);}
    else if(box17.getText().equals("5")){box17.setBackground(Color.white);}
    
   
    if(!box19.getText().equals("4")){box19.setBackground(Color.red);}
    else if(box19.getText().equals("4")){box19.setBackground(Color.white);}
    
    if(!box20.getText().equals("2")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("2")){box20.setBackground(Color.white);}
    
    
    if(!box22.getText().equals("3")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("3")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("2")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("2")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("5")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("5")){box24.setBackground(Color.white);}
    
}
/**
     *Set up Constants for Medium Level10.
     */
protected void     settingConsatantForMediumL10(){//medium10

box3.setText("4");
box9.setText("5");
box13.setText("2");
box15.setText("3");
box17.setText("1");
settingEditability();

box3.setEditable(false);
box9.setEditable(false);
box13.setEditable(false);
box15.setEditable(false);
box17.setEditable(false);

}
/**
     *Checker for Medium Level10.
     */

   protected void checkingMediumL10(){
       if(!box1.getText().equals("1")) {box1.setBackground(Color.red);}
    else if(box1.getText().equals("1")) {box1.setBackground(Color.white);}
    
    if(!box2.getText().equals("5")) {box2.setBackground(Color.red);}
    else if( box2.getText().equals("5")) {box2.setBackground(Color.white);}
    
    
    if(!box4.getText().equals("3")){box4.setBackground(Color.red);}
    else if(box4.getText().equals("3")){box4.setBackground(Color.white);}
    
    if(!box5.getText().equals("2")) {box5.setBackground(Color.red);}
    else if(box5.getText().equals("2")) {box5.setBackground(Color.white);}
    
    if(!box6.getText().equals("2")){box6.setBackground(Color.red);}
    else if(box6.getText().equals("2")){box6.setBackground(Color.white);}
    
    if(!box7.getText().equals("3")){box7.setBackground(Color.red);}
    else if(box7.getText().equals("3")){box7.setBackground(Color.white);}
    
    if(!box8.getText().equals("1")){box8.setBackground(Color.red);}
    else if(box8.getText().equals("1")){box8.setBackground(Color.white);}
    
    if(!box10.getText().equals("4")){box10.setBackground(Color.red);}
    else if(box10.getText().equals("4")){box10.setBackground(Color.white);}
    
    if(!box11.getText().equals("5")){box11.setBackground(Color.red);}
    else if(box11.getText().equals("5")){box11.setBackground(Color.white);}
    
    if(!box12.getText().equals("4")){box12.setBackground(Color.red);}
    else if(box12.getText().equals("4")){box12.setBackground(Color.white);}
    
    if(!box14.getText().equals("1")) {box14.setBackground(Color.red);}
    else if( box14.getText().equals("1")) {box14.setBackground(Color.white);}
    
    if(!box16.getText().equals("4")) {box16.setBackground(Color.red);}
    else if(box16.getText().equals("4")) {box16.setBackground(Color.white);}
    
   
    if(!box18.getText().equals("3")){box18.setBackground(Color.red);}
    else if(box18.getText().equals("3")){box18.setBackground(Color.white);}
    
    if(!box19.getText().equals("2")){box19.setBackground(Color.red);}
    else if(box19.getText().equals("2")){box19.setBackground(Color.white);}
    
    if(!box20.getText().equals("5")){box20.setBackground(Color.red);}
    else if(box20.getText().equals("5")){box20.setBackground(Color.white);}
    
    if(!box21.getText().equals("3")){box21.setBackground(Color.red);}
    else if(box21.getText().equals("3")){box21.setBackground(Color.white);}
    
    if(!box22.getText().equals("2")){box22.setBackground(Color.red);}
    else if(box22.getText().equals("2")){box22.setBackground(Color.white);}
    
    if(!box23.getText().equals("5")){box23.setBackground(Color.red);}
    else if(box23.getText().equals("5")){box23.setBackground(Color.white);}
    
    if(!box24.getText().equals("4")){box24.setBackground(Color.red);}
    else if(box24.getText().equals("4")){box24.setBackground(Color.white);}
    
    if(!box25.getText().equals("1")) {box25.setBackground(Color.red);}
    else if(box25.getText().equals("1")) {box25.setBackground(Color.white);}
}

   
   protected void congratsEasyL1(){
          if(box2.getText().equals("3")  && box3.getText().equals("2") && box4.getText().equals("4") &&box6.getText().equals("4") && 
		  box7.getText().equals("2") && box8.getText().equals("5") && box10.getText().equals("1") && box11.getText().equals("3")  && 
		  box12.getText().equals("4")  && box13.getText().equals("1")  && box14.getText().equals("5")  && box16.getText().equals("2")  && 
		  box17.getText().equals("5") && box19.getText().equals("1")  && box20.getText().equals("3")&& box21.getText().equals("5") && 
		  box23.getText().equals("3")  && box24.getText().equals("2")  && box25.getText().equals("4") )
           JOptionPane.showMessageDialog(null,"Congratulations! You Did it! Continue Playing");}
   
protected void congratsEasyL2(){
    
if( box2.getText().equals("4") && box3.getText().equals("5") && box4.getText().equals("2") &&  box5.getText().equals("3") && 
 box6.getText().equals("2") && box7.getText().equals("5") && box9.getText().equals("1") && box10.getText().equals("4")  && 
 box12.getText().equals("3") && box14.getText().equals("5") && box15.getText().equals("1") && box16.getText().equals("5") && 
 box17.getText().equals("1") && box18.getText().equals("4") && box19.getText().equals("3") && box20.getText().equals("2") && 
 box21.getText().equals("3") && box22.getText().equals("2") && box23.getText().equals("1") && box24.getText().equals("4"))
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");
}
protected void congratsEasyL3(){
    
if(box2.getText().equals("3") && box3.getText().equals("4") && box4.getText().equals("5") && 
box5.getText().equals("2") && box6.getText().equals("5") && box7.getText().equals("4") && box9.getText().equals("2") && 
box11.getText().equals("3") && box12.getText().equals("5") && box13.getText().equals("2") && box15.getText().equals("4") && 
box16.getText().equals("4") && box17.getText().equals("2") && box18.getText().equals("5") && box19.getText().equals("3") && 
box20.getText().equals("1") && box22.getText().equals("1") && box23.getText().equals("3") && box24.getText().equals("4"))
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");
}
protected void congratsEasyL4(){
    
if(box1.getText().equals("5")&& box2.getText().equals("4") && box3.getText().equals("3") && box4.getText().equals("2")&& 
box7.getText().equals("2") && box8.getText().equals("4") && box10.getText().equals("3") && box11.getText().equals("2") && 
box13.getText().equals("1") && box14.getText().equals("4") && box15.getText().equals("5") && box16.getText().equals("3") && 
box17.getText().equals("5") && box19.getText().equals("1") && box20.getText().equals("4") && box22.getText().equals("1") && 
box23.getText().equals("5") && box24.getText().equals("3"))
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");
}
protected void congratsEasyL5(){
    
if(box1.getText().equals("1") && box2.getText().equals("3") && box3.getText().equals("2") && box4.getText().equals("4") && 
box6.getText().equals("5") && box7.getText().equals("2") && box8.getText().equals("4") && box10.getText().equals("3") && 
box12.getText().equals("4") && box13.getText().equals("5") && box15.getText().equals("1") && box16.getText().equals("4") && 
box17.getText().equals("5") && box18.getText().equals("1") && box19.getText().equals("3") && box20.getText().equals("2") && 
box21.getText().equals("2") && box23.getText().equals("3") && box24.getText().equals("5"))
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");
}
protected void congratsEasyL6(){
    
if(box2.getText().equals("2") && box3.getText().equals("3") && box4.getText().equals("4") && box6.getText().equals("5") && 

box7.getText().equals("4") && box9.getText().equals("1") && box10.getText().equals("3") && box11.getText().equals("2") && 
box12.getText().equals("5") && box13.getText().equals("4") && box15.getText().equals("1") && box16.getText().equals("3") && 
box17.getText().equals("1") && box18.getText().equals("5") && box19.getText().equals("2") && box20.getText().equals("4") && 
box22.getText().equals("3") && box24.getText().equals("5") && box25.getText().equals("2"))

 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");

}

protected void congratsEasyL7(){
    
if(box2.getText().equals("2") && box3.getText().equals("3")  && box4.getText().equals("5") && box5.getText().equals("4") && 
box6.getText().equals("5") && box7.getText().equals("4") && box9.getText().equals("2") && 
box11.getText().equals("4") && box12.getText().equals("3") && box14.getText().equals("1") && box15.getText().equals("5") && 
box16.getText().equals("2") && box18.getText().equals("4") && box19.getText().equals("3") && box21.getText().equals("3") && 
box22.getText().equals("1") && box23.getText().equals("5") && box25.getText().equals("2"))
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");

}

protected void congratsEasyL8(){
    

if( box2.getText().equals("5") && box3.getText().equals("4") && box4.getText().equals("3") && box5.getText().equals("2")
 && box6.getText().equals("2") && box7.getText().equals("4") && box9.getText().equals("5") && box11.getText().equals("3") && 
 box12.getText().equals("2") && box13.getText().equals("5") && box14.getText().equals("4") && box15.getText().equals("1") && 
 
 box17.getText().equals("3") && box18.getText().equals("1") && box19.getText().equals("2") && box20.getText().equals("5")
  && box21.getText().equals("5") && box22.getText().equals("4") && box24.getText().equals("1") && box25.getText().equals("3"))
  
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");

}

protected void congratsEasyL9(){
    

    
if(box1.getText().equals("5") && box2.getText().equals("1") && box3.getText().equals("3") && box4.getText().equals("4") && 
box6.getText().equals("3")  && box7.getText().equals("2") && box8.getText().equals("4") && box10.getText().equals("1") && 
box11.getText().equals("4") && box13.getText().equals("1") && box14.getText().equals("2") && box15.getText().equals("5") && 
box16.getText().equals("2") && box18.getText().equals("5") && box19.getText().equals("1") && box22.getText().equals("5") && 
box23.getText().equals("2") && box24.getText().equals("3") && box25.getText().equals("4"))
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");

}

protected void congratsEasyL10(){
    
    
if( box1.getText().equals("2") && box3.getText().equals("5") && box4.getText().equals("4") && box6.getText().equals("1") && 
box7.getText().equals("3") && box9.getText().equals("2") && box10.getText().equals("5") && box11.getText().equals("3") && 
box12.getText().equals("4") && box13.getText().equals("2") && box16.getText().equals("4") && box17.getText().equals("5") && 
box18.getText().equals("3") && box19.getText().equals("1") && box20.getText().equals("2") && box21.getText().equals("5") && 
box23.getText().equals("1") && box25.getText().equals("4"))
 JOptionPane.showMessageDialog(null,"Congratulations! You did it.. Continnue Playing ...");

}



       public void MediumTimeUp1(){if(!box2.getText().equals("2") || !box3.getText().equals("4") ||!box4.getText().equals("5") ||!box6.getText().equals("3") ||
 !box7.getText().equals("4") || !box9.getText().equals("1") || 
!box10.getText().equals("5") || !box11.getText().equals("2") || !box12.getText().equals("1") || !box14.getText().equals("3") || !box15.getText().equals("4") || !box17.getText().equals("5") || !box18.getText().equals("3") || !box19.getText().equals("2") || !box20.getText().equals("1") || !box21.getText().equals("5") ||
 !box22.getText().equals("3") ||  !box23.getText().equals("1") ||  !box24.getText().equals("4") ){
 JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.ERROR_MESSAGE);}
   else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}
   }


   public void MediumTimeUp2(){if(!box2.getText().equals("4") || !box3.getText().equals("5") ||!box4.getText().equals("2") ||!box6.getText().equals("2") ||
 !box7.getText().equals("3") || !box8.getText().equals("4") ||  !box9.getText().equals("1") || 
!box10.getText().equals("1") || !box11.getText().equals("4") || !box13.getText().equals("3") || !box14.getText().equals("1") || !box15.getText().equals("5")
 || !box16.getText().equals("3") || !box17.getText().equals("5") || !box18.getText().equals("1") || !box20.getText().equals("2") || 
 !box22.getText().equals("1") ||  !box23.getText().equals("2") ||  !box24.getText().equals("3") || !box25.getText().equals("4") )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.ERROR_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}
}
      public void MediumTimeUp3(){if(!box1.getText().equals("3")  || !box3.getText().equals("5") ||!box4.getText().equals("4") ||
    !box5.getText().equals("2") ||!box6.getText().equals("2") ||
 !box7.getText().equals("4") || !box8.getText().equals("1") ||  !box9.getText().equals("3") || 
 !box11.getText().equals("4") || !box13.getText().equals("2") || !box14.getText().equals("5") || !box15.getText().equals("1")
|| !box17.getText().equals("5") || !box18.getText().equals("3") || !box19.getText().equals("2") || !box21.getText().equals("5") ||
 !box23.getText().equals("4") ||  !box24.getText().equals("1") || !box25.getText().equals("3") )
  { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}

else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}}

   public void MediumTimeUp4(){if(!box2.getText().equals("2") || !box3.getText().equals("4") ||!box4.getText().equals("3") ||
    !box5.getText().equals("5") ||!box6.getText().equals("4") ||
 !box7.getText().equals("1") || !box8.getText().equals("2") ||  !box9.getText().equals("5") 
           || !box11.getText().equals("5") || !box13.getText().equals("3") || !box14.getText().equals("2") || !box15.getText().equals("1")
 || !box16.getText().equals("2") || !box17.getText().equals("3") || !box19.getText().equals("1") || !box20.getText().equals("4")  ||
 !box22.getText().equals("5") ||  !box23.getText().equals("1") ||  !box24.getText().equals("4") )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}
}


   public void MediumTimeUp5(){if(!box1.getText().equals("1") ||!box2.getText().equals("5") || !box3.getText().equals("2") ||!box4.getText().equals("3") ||
 !box6.getText().equals("2") || !box7.getText().equals("3") || !box9.getText().equals("4") || !box11.getText().equals("4")  || !box13.getText().equals("1") || !box14.getText().equals("5") || !box15.getText().equals("3")
 || !box17.getText().equals("1") || !box18.getText().equals("4") || !box20.getText().equals("5")  ||  !box21.getText().equals("5") || 
 !box22.getText().equals("4") ||  !box23.getText().equals("3") || !box24.getText().equals("1") || !box25.getText().equals("2") )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}
}

   public void MediumTimeUp6(){if(!box2.getText().equals("2") || !box3.getText().equals("3") ||!box4.getText().equals("4") ||
    !box5.getText().equals("5") ||!box6.getText().equals("4") ||
 !box7.getText().equals("1") || 
!box10.getText().equals("2") || !box11.getText().equals("3") || !box13.getText().equals("2") || !box14.getText().equals("5") || !box15.getText().equals("1")
 || !box16.getText().equals("5") || !box17.getText().equals("3") || !box18.getText().equals("1")  || !box20.getText().equals("4")  ||
 !box22.getText().equals("5") ||  !box23.getText().equals("4") ||  !box24.getText().equals("1") || !box25.getText().equals("1") )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}}


   public void MediumTimeUp7(){if(!box1.getText().equals("3") ||!box2.getText().equals("5") || !box3.getText().equals("4") ||!box4.getText().equals("2") ||
    !box5.getText().equals("1") ||!box6.getText().equals("1") ||
 !box8.getText().equals("4") ||  !box9.getText().equals("2") || 
!box11.getText().equals("3") || !box12.getText().equals("1") || !box13.getText().equals("5") || !box15.getText().equals("2")
 || !box16.getText().equals("5") || !box17.getText().equals("4")  || !box19.getText().equals("3") || !box20.getText().equals("1")  ||
 !box22.getText().equals("3") ||  !box23.getText().equals("1") ||  !box24.getText().equals("5") || !box25.getText().equals("4") )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}
}

   public void MediumTimeUp8(){if(!box1.getText().equals("4") ||!box2.getText().equals("2") || !box3.getText().equals("3")  ||
    !box5.getText().equals("5") ||!box6.getText().equals("1") ||
  !box8.getText().equals("4") ||  !box9.getText().equals("2") || 
 !box11.getText().equals("3") || !box12.getText().equals("1") || !box13.getText().equals("5") || !box15.getText().equals("2")
 || !box16.getText().equals("5") || !box17.getText().equals("4") || !box19.getText().equals("3") || !box20.getText().equals("1") ||
 !box22.getText().equals("3") ||  !box23.getText().equals("1") ||  !box24.getText().equals("5") || !box25.getText().equals("4") )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}
}


   public void MediumTimeUp9(){if(!box1.getText().equals("5") ||!box2.getText().equals("2") || !box3.getText().equals("1") ||!box4.getText().equals("3") ||
    !box5.getText().equals("4") ||!box7.getText().equals("4") || !box8.getText().equals("5") ||  !box9.getText().equals("1") || 
!box10.getText().equals("3") || !box11.getText().equals("3") || !box12.getText().equals("1") || !box13.getText().equals("4") || !box14.getText().equals("2") 
 || !box16.getText().equals("1") || !box17.getText().equals("5")  || !box19.getText().equals("4") || !box20.getText().equals("2")  ||
 !box22.getText().equals("3") ||  !box23.getText().equals("2") ||  !box24.getText().equals("5")  )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}
}


   public void MediumTimeUp10(){if(!box1.getText().equals("1") ||!box2.getText().equals("5") || !box4.getText().equals("3") ||
    !box5.getText().equals("2") ||!box6.getText().equals("2") ||
 !box7.getText().equals("3") || !box8.getText().equals("1") || 
!box10.getText().equals("4") || !box11.getText().equals("5") || !box12.getText().equals("4") ||  !box14.getText().equals("1") 
 || !box16.getText().equals("4") ||  !box18.getText().equals("3") || !box19.getText().equals("2") || !box20.getText().equals("5") || !box21.getText().equals("3") ||
 !box22.getText().equals("2") ||  !box23.getText().equals("5") ||  !box24.getText().equals("4") || !box25.getText().equals("1") )
 { JOptionPane.showMessageDialog(object,"Time's Up!","Warning",JOptionPane.WARNING_MESSAGE);}


else { JOptionPane.showMessageDialog(null,"Congratulations You Have Done it! Coninue Playing...");}}

   
   
   public void congratulationsMedium1(){
if( box2.getText().equals("2") &&  box3.getText().equals("4") && box4.getText().equals("5") && box6.getText().equals("3") &&
  box7.getText().equals("4") &&  box9.getText().equals("1") && 
 box10.getText().equals("5") &&  box11.getText().equals("2") &&  box12.getText().equals("1") &&  box14.getText().equals("3") &&  box15.getText().equals("4") &&  box17.getText().equals("5") &&  box18.getText().equals("3") &&  box19.getText().equals("2") &&  box20.getText().equals("1") &&  box21.getText().equals("5") &&
  box22.getText().equals("3") &&   box23.getText().equals("1") &&   box24.getText().equals("4") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}
   }


   public void congratulationsMedium2(){if( box2.getText().equals("4") &&  box3.getText().equals("5") && box4.getText().equals("2") && box6.getText().equals("2") &&
  box7.getText().equals("3") &&  box8.getText().equals("4") &&   box9.getText().equals("1") && 
 box10.getText().equals("1") &&  box11.getText().equals("4") &&  box13.getText().equals("3") &&  box14.getText().equals("1") &&  box15.getText().equals("5")
 &&  box16.getText().equals("3") &&  box17.getText().equals("5") &&  box18.getText().equals("1") &&  box20.getText().equals("2") && 
  box22.getText().equals("1") &&   box23.getText().equals("2") &&   box24.getText().equals("3") &&  box25.getText().equals("4") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}
}
      public void congratulationsMedium3(){if( box1.getText().equals("3")  &&  box3.getText().equals("5") && box4.getText().equals("4") &&
     box5.getText().equals("2") && box6.getText().equals("2") &&
  box7.getText().equals("4") &&  box8.getText().equals("1") &&   box9.getText().equals("3") && 
  box11.getText().equals("4") &&  box13.getText().equals("2") &&  box14.getText().equals("5") &&  box15.getText().equals("1")
&&  box17.getText().equals("5") &&  box18.getText().equals("3") &&  box19.getText().equals("2") &&  box21.getText().equals("5") &&
  box23.getText().equals("4") &&   box24.getText().equals("1") &&  box25.getText().equals("3") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}}

 public void congratulationsMedium4(){if( box2.getText().equals("2") &&  box3.getText().equals("4") && box4.getText().equals("3") &&
     box5.getText().equals("5") && box6.getText().equals("4") &&
  box7.getText().equals("1") &&  box8.getText().equals("2") &&   box9.getText().equals("5") 
           &&  box11.getText().equals("5") &&  box13.getText().equals("3") &&  box14.getText().equals("2") &&  box15.getText().equals("1")
 &&  box16.getText().equals("2") &&  box17.getText().equals("3") &&  box19.getText().equals("1") &&  box20.getText().equals("4")  &&
  box22.getText().equals("5") &&   box23.getText().equals("1") &&   box24.getText().equals("4") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}}

   public void congratulationsMedium5(){if( box1.getText().equals("1") && box2.getText().equals("5") &&  box3.getText().equals("2") && box4.getText().equals("3") &&
  box6.getText().equals("2") &&  box7.getText().equals("3") &&  box9.getText().equals("4") &&  box11.getText().equals("4")  &&  box13.getText().equals("1") &&  box14.getText().equals("5") &&  box15.getText().equals("3")
 &&  box17.getText().equals("1") &&  box18.getText().equals("4") &&  box20.getText().equals("5")  &&   box21.getText().equals("5") && 
  box22.getText().equals("4") &&   box23.getText().equals("3") &&  box24.getText().equals("1") &&  box25.getText().equals("2") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}
}
   public void congratulationsMedium6(){if( box2.getText().equals("2") &&  box3.getText().equals("3") && box4.getText().equals("4") &&
     box5.getText().equals("5") && box6.getText().equals("4") &&
  box7.getText().equals("1") && 
 box10.getText().equals("2") &&  box11.getText().equals("3") &&  box13.getText().equals("2") &&  box14.getText().equals("5") &&  box15.getText().equals("1")
 &&  box16.getText().equals("5") &&  box17.getText().equals("3") &&  box18.getText().equals("1")  &&  box20.getText().equals("4")  &&
  box22.getText().equals("5") &&   box23.getText().equals("4") &&   box24.getText().equals("1") &&  box25.getText().equals("1") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}}
   public void congratulationsMedium7(){if( box1.getText().equals("3") && box2.getText().equals("5") &&  box3.getText().equals("4") && box4.getText().equals("2") &&
     box5.getText().equals("1") && box6.getText().equals("1") &&
  box8.getText().equals("4") &&   box9.getText().equals("2") && 
 box11.getText().equals("3") &&  box12.getText().equals("1") &&  box13.getText().equals("5") &&  box15.getText().equals("2")
 &&  box16.getText().equals("5") &&  box17.getText().equals("4")  &&  box19.getText().equals("3") &&  box20.getText().equals("1")  &&
  box22.getText().equals("3") &&   box23.getText().equals("1") &&   box24.getText().equals("5") &&  box25.getText().equals("4") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}
}

   public void congratulationsMedium8(){if( box1.getText().equals("4") && box2.getText().equals("2") &&  box3.getText().equals("3")  &&
     box5.getText().equals("5") && box6.getText().equals("1") &&
   box8.getText().equals("4") &&   box9.getText().equals("2") && 
  box11.getText().equals("3") &&  box12.getText().equals("1") &&  box13.getText().equals("5") &&  box15.getText().equals("2")
 &&  box16.getText().equals("5") &&  box17.getText().equals("4") &&  box19.getText().equals("3") &&  box20.getText().equals("1") &&
  box22.getText().equals("3") &&   box23.getText().equals("1") &&   box24.getText().equals("5") &&  box25.getText().equals("4") )
{JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}
}


   public void congratulationsMedium9(){if( box1.getText().equals("5") && box2.getText().equals("2") &&  box3.getText().equals("1") && box4.getText().equals("3") &&
     box5.getText().equals("4") && box7.getText().equals("4") &&  box8.getText().equals("5") &&   box9.getText().equals("1") && 
 box10.getText().equals("3") &&  box11.getText().equals("3") &&  box12.getText().equals("1") &&  box13.getText().equals("4") &&  box14.getText().equals("2") 
 &&  box16.getText().equals("1") &&  box17.getText().equals("5")  &&  box19.getText().equals("4") &&  box20.getText().equals("2")  &&
  box22.getText().equals("3") &&   box23.getText().equals("2") &&   box24.getText().equals("5")  )
 { 
     JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}
   }


   public void congratulationsMedium10(){if( box1.getText().equals("1") && box2.getText().equals("5") &&  box4.getText().equals("3") &&
     box5.getText().equals("2") && box6.getText().equals("2") &&
  box7.getText().equals("3") &&  box8.getText().equals("1") && 
 box10.getText().equals("4") &&  box11.getText().equals("5") &&  box12.getText().equals("4") &&   box14.getText().equals("1") 
 &&  box16.getText().equals("4") &&   box18.getText().equals("3") &&  box19.getText().equals("2") &&  box20.getText().equals("5") &&  box21.getText().equals("3") &&
  box22.getText().equals("2") &&   box23.getText().equals("5") &&   box24.getText().equals("4") &&  box25.getText().equals("1") )
{ JOptionPane.showMessageDialog(null,"Congratulations You Have Done it  Coninue Playing...");}}
        

    /**
     *Set up Input Taker.
     * @param e
     */
   protected void settingInputForLevels(ActionEvent e){
if(e.getSource()==box1){  
    input=box1.getText();
    
    if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}


    if(e.getSource()==box2){  
    input=box2.getText();
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}

    if(e.getSource()==box3){  
    input=box3.getText();

     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}

    if(e.getSource()==box4){  
    input=box4.getText();
    
 if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}

if(e.getSource()==box5){  
    input=box5.getText();
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}


    if(e.getSource()==box6){  
    input=box6.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}

    if(e.getSource()==box7){  
    input=box7.getText();
    
 if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	
    }}

    if(e.getSource()==box8){
        input=box8.getText();

    if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}


if(e.getSource()==box9){  
    input=box9.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}


    if(e.getSource()==box10){  
    input=box10.getText();

     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
}}

    if(e.getSource()==box11){  
    input=box11.getText();
    
   if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}

    if(e.getSource()==box12){  
    input=box12.getText();
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
	
	if(e.getSource()==box13){
        
    input=box13.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
	if(e.getSource()==box14){
        
    input=box14.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    

if(e.getSource()==box15){  
    input=box15.getText();
    
   if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}

    
	if(e.getSource()==box16){
        
    input=box16.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
	if(e.getSource()==box17){
        
    input=box17.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
    
if(e.getSource()==box18){  
    input=box18.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}

    
	if(e.getSource()==box19){
        
    input=box19.getText();
    
    if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
	if(e.getSource()==box20){
        
    input=box20.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
	if(e.getSource()==box21){
        
    input=box21.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
    
if(e.getSource()==box22){  
    input=box22.getText();
    
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}

    
	if(e.getSource()==box23){
        
    input=box23.getText();
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
	if(e.getSource()==box24){
        
    input=box24.getText();
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);
	}}
    
	if(e.getSource()==box25){
        
    input=box25.getText();
     if(input.equals("5") || input.equals("4")||input.equals("3")||input.equals("2")||input.equals("1"))
    {}else
    {JOptionPane.showMessageDialog(object,"Number Must be in the range of 1-5","ERROR",JOptionPane.WARNING_MESSAGE);

}}}
}