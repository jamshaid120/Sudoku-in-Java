
package semesterproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *In this Class, Working of Each Button is defined using ActionListenr.
 */
public class ButtonsWorking extends LevelSetter implements ActionListener {
    
   /**
    
    * Constructor calls Method which all ActionListener to all Components.
    */
    ButtonsWorking() {
        actions();
    }
/**
 * This adds ActionListener to All Components.
     it is private because 
    1) if it is static then there will be an error as all the 
    variables are being used are of non static function and non static variables can't be used in static Function
    2) if it is public then the info available in this method can be accessed outside to the class and it can also 
    be override which will effect in loss of all the working of buttons and then the code for the buttons will be of 
    no use.
    3) if it is made protected then it can be accessed and can be override in the child classes(if made any) and 
    will cause loss of data and the buttons working
   
    */
    
  private  void actions(){  
        easy.addActionListener(this);
        medium.addActionListener(this);
        hard.addActionListener(this);
        help.addActionListener(this);

        EasyNewGame.addActionListener(this);
        MediumNewGame.addActionListener(this);
        HardNewGame.addActionListener(this);
        
        EasyCheck.addActionListener(this);
        MediumCheck.addActionListener(this);
        HardCheck.addActionListener(this);

        box1.addActionListener(this);
        box2.addActionListener(this);
        box3.addActionListener(this);
        box4.addActionListener(this);
        box5.addActionListener(this);
        box6.addActionListener(this);
        box7.addActionListener(this);
        box8.addActionListener(this);
        box9.addActionListener(this);
        box10.addActionListener(this);
        box11.addActionListener(this);
        box12.addActionListener(this);
        box13.addActionListener(this);
        box14.addActionListener(this);
        box15.addActionListener(this);
        box16.addActionListener(this);
        box17.addActionListener(this);
        box18.addActionListener(this);
        box19.addActionListener(this);
        box20.addActionListener(this);
        box21.addActionListener(this);
        box22.addActionListener(this);
        box23.addActionListener(this);
        box24.addActionListener(this);
        box25.addActionListener(this);}
/**
 * Defines what action is to perform when a button is pressed.
  this method is public as it's signature in the parent class
  (which is an interface of name ActionListener inherited with ActionEvent) is public
  and we want this code to run always and working of every button is associated with this 
  code and if it is public, protected or private the "main()" method will not be able to access it and
  it will be of no use then 
     * @param e
*/
    @Override
    public  void actionPerformed(ActionEvent e) {
           
        if(e.getSource()==easy){         
            
    frame.remove(HardNewGame);
    frame.remove(MediumNewGame);
    frame.remove(MediumCheck);
    frame.remove(HardCheck);
    frame.setResizable(false);

            frame.add(EasyCheck);
            EasyCheck.setBounds(300,250,70,30);
            frame.add(EasyNewGame);
            EasyNewGame.setBounds(300,280,70,30);
        
            EasyCounter=EasyCounter+1;
                
                addingtoframe();
                settingBounds();
                settingText();
                settingColor();
               

        
        if(EasyCounter==1){settingConsatantForEasyL1();}
        else if(EasyCounter==2){settingConsatantForEasyL2();}
        else if(EasyCounter==3){settingConsatantForEasyL3();}
        else if(EasyCounter==4){settingConsatantForEasyL4();}
        else if(EasyCounter==5){settingConsatantForEasyL5();}
        else if(EasyCounter==6){settingConsatantForEasyL6();}
        else if(EasyCounter==7){settingConsatantForEasyL7();}
        else if(EasyCounter==8){settingConsatantForEasyL8();}
        else if(EasyCounter==9){settingConsatantForEasyL9();}
        else if(EasyCounter==10){settingConsatantForEasyL10();}
       if(EasyCounter==11){EasyCounter=1;}

        }
        
                //Medium Level Button

if(e.getSource()==medium){
    frame.remove(EasyNewGame);
    frame.remove(HardNewGame);
    frame.remove(EasyCheck);
    frame.remove(HardCheck);
    frame.setResizable(false);
    frame.add(MediumNewGame);
    MediumNewGame.setBounds(300,280,70,30);
    frame.add(MediumCheck);
    MediumCheck.setBounds(300,250,70,30);
    
        addingtoframe();
        settingBounds();
        settingText();
        settingColor();
    if(MediumCounter==1){settingText();settingConsatantForMediumL1();;new Reminder(120);}
       else if(MediumCounter==2){settingText();settingConsatantForMediumL2();settingEditability();new Reminder(120);}
       else if(MediumCounter==3){settingText();settingConsatantForMediumL3();settingEditability();new Reminder(120);}
       else if(MediumCounter==4){settingText();settingConsatantForMediumL4();settingEditability();new Reminder(120);}
       else if(MediumCounter==5){settingText();settingConsatantForMediumL5();settingEditability();new Reminder(120);}
       else if(MediumCounter==6){settingText();settingConsatantForMediumL6();settingEditability();new Reminder(120);}
       else if(MediumCounter==7){settingText();settingConsatantForMediumL7();settingEditability();new Reminder(120);}
       else if(MediumCounter==8){settingText();settingConsatantForMediumL8();settingEditability();new Reminder(120);}
       else if(MediumCounter==8){settingText();settingConsatantForMediumL8();settingEditability();new Reminder(120);}
       else if(MediumCounter==9){settingText();settingConsatantForMediumL9();settingEditability();new Reminder(120);}
       else if(MediumCounter==10){settingText();settingConsatantForMediumL10();settingEditability();new Reminder(120);}
if(MediumCounter==11){MediumCounter=1;}

}
        
//Hard Level Button
if(e.getSource()==hard){
    frame.remove(EasyNewGame);
    frame.remove(EasyCheck);
    frame.remove(MediumNewGame);
    frame.remove(MediumCheck);
    
    frame.add(HardCheck);    
    HardCheck.setBounds(300,250,70,30);
    frame.add(HardNewGame);    
    HardNewGame.setBounds(300,280,70,30);

    HardCounter=HardCounter+1;
                addingtoframe();
                settingBounds();
                settingText();
                settingColor();
        if(HardCounter==1){settingText();settingConsatantForHardL1();new Reminder(30);}
       else if(HardCounter==2){settingText();settingConsatantForHardL2();new Reminder(30);}
       else if(HardCounter==2){settingText();settingConsatantForHardL2();new Reminder(30);}
       else if(HardCounter==3){settingText();settingConsatantForHardL3();new Reminder(30);}
       else if(HardCounter==4){settingText();settingConsatantForHardL4();new Reminder(30);}
       else if(HardCounter==5){settingText();settingConsatantForHardL5();new Reminder(30);}
       else if(HardCounter==6){settingText();settingConsatantForHardL6();new Reminder(30);}
       else if(HardCounter==7){settingText();settingConsatantForHardL7();new Reminder(30);}
       else if(HardCounter==8){settingText();settingConsatantForHardL8();new Reminder(30);}
       else if(HardCounter==9){settingText();settingConsatantForHardL9();new Reminder(30);}
       else if(HardCounter==10){settingText();settingConsatantForHardL10();new Reminder(30);}
if(HardCounter==11){HardCounter=1;}

}
        //Working of New Game Button in Easy Level

if(e.getSource()==EasyNewGame){
    
EasyCounter =EasyCounter+1;

        if(EasyCounter==1){settingText();settingConsatantForEasyL1();settingColor();}
       else if(EasyCounter==2){settingText();settingConsatantForEasyL2();settingColor();}
       else if(EasyCounter==3){settingText();settingConsatantForEasyL3();settingColor();}
       else if(EasyCounter==4){settingText();settingConsatantForEasyL4();settingColor();}
       else if(EasyCounter==5){settingText();settingConsatantForEasyL5();settingColor();}
       else if(EasyCounter==6){settingText();settingConsatantForEasyL6();settingColor();}
       else if(EasyCounter==7){settingText();settingConsatantForEasyL7();settingColor();}
       else if(EasyCounter==8){settingText();settingConsatantForEasyL8();settingColor();}
       else if(EasyCounter==9){settingText();settingConsatantForEasyL9();settingColor();}
       else if(EasyCounter==10){settingText();settingConsatantForEasyL10();settingColor();}
if(EasyCounter==11){EasyCounter=1;}

}
//Working of New Game Button in Medium Level

if(e.getSource()==MediumNewGame){
    MediumCounter=MediumCounter+1;

 if(MediumCounter==1){settingColor();settingText();settingConsatantForMediumL1();new Reminder(120);}
       else if(MediumCounter==2){settingColor();settingText();settingConsatantForMediumL2();new Reminder(120);}
       else if(MediumCounter==3){settingColor();settingText();settingConsatantForMediumL3();new Reminder(120);}
       else if(MediumCounter==4){settingColor();settingText();settingConsatantForMediumL4();new Reminder(120);}
       else if(MediumCounter==5){settingColor();settingText();settingConsatantForMediumL5();new Reminder(120);}
       else if(MediumCounter==6){settingColor();settingText();settingConsatantForMediumL6();new Reminder(120);}
       else if(MediumCounter==7){settingColor();settingText();settingConsatantForMediumL7();new Reminder(120);}
       else if(MediumCounter==8){settingColor();settingText();settingConsatantForMediumL8();new Reminder(120);}
       else if(MediumCounter==9){settingColor();settingText();settingConsatantForMediumL9();new Reminder(120);}
       else if(MediumCounter==10){settingColor();settingText();settingConsatantForMediumL10();new Reminder(120);}
        if(MediumCounter==11){MediumCounter=1;}

}
//Working of New Game Button in Hard Level
if(e.getSource()==HardNewGame){
    HardCounter=HardCounter+1;

        if(HardCounter==1){settingColor();settingText();settingConsatantForHardL1();}
       else if(HardCounter==2){settingColor();settingText();settingConsatantForHardL2();}
       else if(HardCounter==2){settingColor();settingText();settingConsatantForHardL2();}
       else if(HardCounter==3){settingColor();settingText();settingConsatantForHardL3();}
       else if(HardCounter==4){settingColor();settingText();settingConsatantForHardL4();}
       else if(HardCounter==5){settingColor();settingText();settingConsatantForHardL5();}
        else if(HardCounter==6){settingColor();settingText();settingConsatantForHardL6();}
        else if(HardCounter==7){settingColor();settingText();settingConsatantForHardL7();}
        else if(HardCounter==8){settingColor();settingText();settingConsatantForHardL8();}
        else if(HardCounter==9){settingColor();settingText();settingConsatantForHardL9();}
       else  if(HardCounter==10){settingColor();settingText();settingConsatantForHardL10();}

    if(HardCounter==11){HardCounter=1;}
               
}
        //Working of check button in Easy Level

if( e.getSource()==EasyCheck){
                if(EasyCounter==1){checkingEasyL1(); congratsEasyL1();} 
                else if(EasyCounter==2){checkingEasyL2(); congratsEasyL2();} 
                else if(EasyCounter==3){checkingEasyL3(); congratsEasyL3();}
                else if(EasyCounter==4){checkingEasyL4(); congratsEasyL4();}
                else if(EasyCounter==5){checkingEasyL5(); congratsEasyL5();}
                else if(EasyCounter==6){checkingEasyL6(); congratsEasyL6();}
                else if(EasyCounter==7){checkingEasyL7(); congratsEasyL7();}
                else if(EasyCounter==8){checkingEasyL8(); congratsEasyL8();}
                else if(EasyCounter==9){checkingEasyL9(); congratsEasyL9();}
                else if(EasyCounter==10){checkingEasyL10();congratsEasyL10();} 
                 
                 }
//Working of check button in Medium Level
if(e.getSource()==MediumCheck){
    if(MediumCounter==1){checkingMediumL1(); congratulationsMedium1();}
    else if(MediumCounter==2){checkingMediumL2();congratulationsMedium2();} 
    else if(MediumCounter==3){checkingMediumL3(); congratulationsMedium3();}
    else if(MediumCounter==4){checkingMediumL4(); congratulationsMedium4();}
    else if(MediumCounter==5){checkingMediumL5();congratulationsMedium5();} 
   else if(MediumCounter==6){checkingMediumL6(); congratulationsMedium6();}
   else if(MediumCounter==7){checkingMediumL7(); congratulationsMedium7();}
   else if(MediumCounter==8){checkingMediumL8(); congratulationsMedium8();}
   else if(MediumCounter==9){checkingMediumL9(); congratulationsMedium9();}
   else if(MediumCounter==10){checkingMediumL10(); congratulationsMedium10();}
}
//Working of Chock button in hard level
if(e.getSource()==HardCheck){
    //will show no colors in the game.. only will show dialo0g box when level completes
                if(HardCounter==1)checkingHardL1(); 
                else if(HardCounter==2)checkingHardL2(); 
                else if(HardCounter==3)checkingHardL3(); 
                else if(HardCounter==4)checkingHardL4(); 
                else if(HardCounter==5)checkingHardL5(); 
                else if(HardCounter==6)checkingHardL6(); 
                else if(HardCounter==7)checkingHardL7(); 
                else if(HardCounter==8)checkingHardL8(); 
                else if(HardCounter==9)checkingHardL9(); 
                else if(HardCounter==10)checkingHardL10();}
//Working of Help Buutton
if(e.getSource()==help){settingHelpContent();}

//Method Called to take input
settingInputForLevels(e);
    }
}
