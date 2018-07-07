
package semesterproject;

import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * In this Class, Components which are used in the whole Project are Defined.
 
 */
public class ComponentsDefined {
//all the caomponents are kept protected as we only want to use them in child classes not in the other classes 


    /**
     *used to store the input in the textBox.
     */
        
        protected String input;

    /**
     *Used to Make  Counter in Game to Control flow of Levels. 
     */
        
  protected int EasyCounter=0;
  protected static int HardCounter=0;
  protected  static  int MediumCounter=1;

    /**
     *Used when Displaying Warning Dialog .
     */
    protected JOptionPane object=new JOptionPane();
    //Game selector Buttons
    protected Button easy=new Button("Easy");
    protected Button medium=new Button("Medium");
    protected Button hard=new Button("Hard");
    
    protected Button help=new Button("How to Play");

    /**
     *Buttons used for purpose of checking Levels
     */
    protected Button EasyCheck=new Button("Check!");
    protected Button MediumCheck=new Button("Check!");
    protected Button HardCheck=new Button("Check!");

    /**
     *Used to go to new Level.
     */
    protected Button EasyNewGame=new Button("New Game");
    protected Button MediumNewGame=new Button("New Game");
    protected Button HardNewGame=new Button("New Game");

    /**
     *Used to Display Output frames.
     */
    protected JFrame mainFrame=new JFrame("Sudoku");
    protected JFrame frameForHelp=new JFrame("Help !");
    protected JPanel mainPanel=new JPanel();
    protected JTextArea mainArea=new JTextArea();
    protected JTextArea helpArea=new JTextArea();

    /**
     *Used to Display SubFrame that contains level to play.
     */
    protected JFrame frame=new JFrame("Play !");
    protected JPanel panel=new JPanel();

  
     protected JTextField box1=new JTextField();
     protected JTextField box2=new JTextField();
     protected JTextField box3=new JTextField();
     protected JTextField box4=new JTextField();
     protected JTextField box5=new JTextField();
     protected JTextField box6=new JTextField();
     protected JTextField box7=new JTextField();
     protected JTextField box8=new JTextField();
     protected JTextField box9=new JTextField();
     protected JTextField box10=new JTextField();
     protected JTextField box11=new JTextField();
     protected JTextField box12=new JTextField();
     protected JTextField box13=new JTextField();
      protected JTextField box14=new JTextField();
      protected JTextField box15=new JTextField();
      protected JTextField box16=new JTextField();
      protected JTextField box17=new JTextField();
      protected JTextField box18=new JTextField();
      protected JTextField box19=new JTextField();
      protected JTextField box20=new JTextField();
      protected JTextField box21=new JTextField();
      protected JTextField box22=new JTextField();
      protected JTextField box23=new JTextField();
      protected JTextField box24=new JTextField();
      protected JTextField box25=new JTextField();



}
