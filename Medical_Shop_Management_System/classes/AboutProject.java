package classes;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AboutProject  extends JFrame{
     private JLabel labelimg,headline,labeldasbord;
      private Font f,ff,fff;
       private JPanel panel;
        private ImageIcon img;
        private JTextArea textAbout;
        private JButton button;
    
public AboutProject()
{
    
  this.initializeComponents();

    this.setTitle("About : Medical Shop Management System");
    this.setSize(900, 512);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);  
    
    
    
}
public void initializeComponents(){
    this.panel = new JPanel(null);
    this.headline=new JLabel("About Medical Shop Management System");
    this.headline.setBounds(50, 0, 400, 100);
     fff=new Font("Arial",Font.BOLD,20);
     f=new Font("Arial",Font.ROMAN_BASELINE,15);
    headline.setFont(fff);
    headline.setForeground(Color.black);
    this.panel.add(this.headline);
    panel.setBackground(Color.lightGray);
     this.add(this.panel);
     
     
     
    
    
      img=new ImageIcon(getClass().getResource("pharmacy.jpg"));
      this.labelimg=new JLabel(img);
      this.labelimg.setBounds(10, 100, 300, 300);
      this.panel.add(this.labelimg);
       this.labeldasbord=new JLabel("_____________________________________________");
    this.labeldasbord.setBounds(50, 10, 400, 100);
    labeldasbord.setFont(fff);
    labeldasbord.setForeground(Color.darkGray);
    this.panel.add(this.labeldasbord);
    
    
    
     this.textAbout = new JTextArea(" A pharmacy (also called \"drugstore\" in American English or \"community\n"
             + " pharmacy\" or \"chemist\""
             + " in Commonwealth English, or rarely, apothecary)\n is a retail shop which provides pharmaceutical"+""
             + " drugs, among other\n products. At the pharmacy, a pharmacist oversees the fulfillment of\n medical"+""
             + " prescriptions and is available to counsel patients about \n prescription and over-the-counter drugs"+""
             + " or about health problems and \n wellness issues.\n"
             +"           \n"
             + "©️ This Project is Research and Developed By :\n"
             
     +"1. BADHON KUMAR BISWAS  (22-47992-2)\n"
     +"2.FARAH MAFRUHA (22-48152-2)\n"
     +"3.ZARIN TASNIM OISHEE (22-48013-2)\n"
     +"4.ZOBAYER AL MAHMUD (22-47989-2)");
    this.textAbout.setBounds(320, 100, 200, 100);
    textAbout.setFont(f);
    textAbout.setEditable(false);
    textAbout.setBounds(320, 100, 500, 250);
   textAbout.setWrapStyleWord(true);
    this.panel.add(this.textAbout);
    
    
    this.button = new JButton("Back");
            
    this.button.setBounds(680, 400, 100, 30);
     button.setFont(f);
    this.panel.add(this.button);
    
    
       this.button.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
           setVisible(false);
          new Dashboard();
      
          }
    
    
    });
     
 
}


}