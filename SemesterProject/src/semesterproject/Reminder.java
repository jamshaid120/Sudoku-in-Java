package semesterproject;
import java.util.Timer;
import java.util.TimerTask;

/**
     In this Class, a Timer has been set to control the medium level.
     */
public class Reminder extends ButtonsWorking{
    
    Timer timer = new Timer();//a built in class
   //comstructor 
    public Reminder(int seconds) {
        
        mainFrame.setVisible(true);
        /*Condition set as we are sending 0  seconds whilce call this. 
        this is the most child class that's y to get the most working of the program we called this CLASS(rEMINDER)*/
if(seconds!=0){
timer.schedule(new RemindTask(), seconds*1000);}}

    class RemindTask extends TimerTask  {
       RemindTask(){mainFrame.dispose();} 
        @Override
        public void run() {           
               if(MediumCounter==1){MediumTimeUp1();}
           else if(MediumCounter==2)MediumTimeUp2();
           else if(MediumCounter==3)MediumTimeUp3();
           else if(MediumCounter==4)MediumTimeUp4();
           else if(MediumCounter==5)MediumTimeUp5();
           else if(MediumCounter==6)MediumTimeUp6();
           else if(MediumCounter==7)MediumTimeUp7();
           else if(MediumCounter==8)MediumTimeUp8();
           else if(MediumCounter==9)MediumTimeUp9();
           else if(MediumCounter==10)MediumTimeUp10();
           else if(HardCounter==1)checkingHardL1();
           else if(HardCounter==2)checkingHardL2();
           else if(HardCounter==3)checkingHardL3();
           else if(HardCounter==4)checkingHardL4();
           else if(HardCounter==5)checkingHardL5();
           else if(HardCounter==6)checkingHardL6();
           else if(HardCounter==7)checkingHardL7();
           else if(HardCounter==8)checkingHardL8();
           else if(HardCounter==9)checkingHardL9();
           else if(HardCounter==10)checkingHardL10();
timer .cancel();

        }
        }
    }

