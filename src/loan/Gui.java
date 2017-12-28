/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author moh
 */
public class Gui extends JFrame  {
      private JComboBox jobCombo; 
  private String [] job= {"management","admin","self-employed","student","housemaid","retired" ,"technician", "services", "blue-collar", "unemployed", "entrepreneur", "unknown"};
  private String [] marital = {"single", "married", "divorced"};
    private String [] education = {"secondary", "tertiary", "primary", "unknown"};
    private String [] housing ={"no", "yes"};
    private JButton btn ; 
      private JComboBox housingCombo; 
    private JComboBox educationCombo; 
  private JComboBox maritalCombo; 
    private JLabel label ; 
    private JPanel panel;
    private String jobSelected ; 
        private String housingSelected ; 
    private String maritalSelected ; 
    private String educationSelected ; 
private String decision ; 
    public Gui(){
        panel = new JPanel(new GridLayout(10,0));
        this.add(panel);
        this.setTitle("Data Mining");
        this.setSize(500,500);
      
//Create the combo box, select item at index 4.
//Indices start at 0, so 4 specifies the pig.


//petList.addActionListener((ActionListener) this); 
      //  setLayout(new FlowLayout());
  this.jobCombo =  new JComboBox(this.job);
  this.maritalCombo = new JComboBox(this.marital);
  this.educationCombo = new JComboBox(this.education);
   this.housingCombo = new JComboBox(this.housing);
   this.btn = new JButton("submit");
   this.label = new JLabel();

  panel.add(jobCombo);
  panel.add(maritalCombo);
   panel.add(educationCombo);
      panel.add(housingCombo);
panel.add(btn);
panel.add(label);


btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           //
                jobSelected = (String) jobCombo.getSelectedItem();
                housingSelected = (String) housingCombo.getSelectedItem();
              educationSelected = (String) educationCombo.getSelectedItem();
              maritalSelected = (String) maritalCombo.getSelectedItem();

           
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
  

    public String getJobSelected() {
        return jobSelected;
    }

    public String getHousingSelected() {
        return housingSelected;
    }

    public String getMaritalSelected() {
        return maritalSelected;
    }

    public String getEducationSelected() {
        return educationSelected;
    }
    public void setOutCome(String decision){
        this.decision = decision;
        this.label.setText(decision);
    }
    
}
