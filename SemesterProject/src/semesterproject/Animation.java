
package semesterproject;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
     In this Class, a slide show has been set up with a delay of 1.5 seconds. 
     */
public final class Animation extends JFrame{
    
    JLabel pic = new JLabel();
    Timer tm;
    int counter = 0;


    //Images Path In Array
    String[] list = {"1111.png","4444.png","5555.png","5555.png"};
    
    public Animation(){
        setLocationByPlatform(rootPaneCheckingEnabled);
        pic.setBounds(0, 0, 800, 600);
            setUndecorated(true);
            
        //Call The Function SetImageSize
        SetImageSize(3);
       //set a timer
    
        tm = new Timer(1500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                   SetImageSize(counter);
                 counter++;
                         
             if(counter >= list.length ){
                 new Reminder(0);

tm.stop();
setVisible(false) ;
             }
}
                
        });
        add(pic);
        tm.start();
        

        setSize(800, 400);
        setVisible(true);
    }
    //create a function to resize the image 

    public void SetImageSize(int i){
        
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
       img = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH );
        ImageIcon newImc = new ImageIcon(img);
            pic.setIcon(newImc);
            if(i==3)
            pic.setVisible(false);
            else {                pic.setVisible(true);
                if(i==2){pic.setVisible(true);}            }

    }

}
