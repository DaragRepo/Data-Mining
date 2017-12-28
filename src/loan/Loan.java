/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import static java.lang.Thread.sleep;


/**
 *
 * @author moh
 */
public class Loan {
   


    public static void main(String[] args) throws InterruptedException{

//    Facade f =new Facade("no","age"); 
//        System.out.println(f.getYesOrNo()); // i gave it yes so it will return all the age with yes 
//              System.out.println(f.countAllYes()); // this is to count all the yes in the data set 
//                
//        
//                

//Facade f =new Facade("no","age"); 
//        System.out.println(f.getYesOrNo()); // i gave it yes so it will return all the age with yes 
//                System.out.println(f.countAllYes()); // this is to count all the yes in the data set 

// my main 
    FeatureProbability f = new FeatureProbability();
    Classifier c = new Classifier();
    
    double ageyes,ageno,jobyes,jobno,maritalyes,maritalno,educationyes,educationno,housingyes,housingno,loanyes,loanno ;
   // ageyes = c.Fetch_probablty_with_Yes(, null);
Gui g  =new Gui();    
sleep(20000);
    jobyes = c.Fetch_probablty_with_Yes("job",g.getJobSelected() );
    jobno = c.Fetch_probablty_with_No("job",g.getJobSelected());
   
    maritalyes = c.Fetch_probablty_with_Yes("marital", g.getMaritalSelected());
    maritalno = c.Fetch_probablty_with_No("marital", g.getMaritalSelected());
     
    educationyes = c.Fetch_probablty_with_Yes("education", g.getEducationSelected());
    educationno = c.Fetch_probablty_with_No("education", g.getEducationSelected());
     
    housingyes = c.Fetch_probablty_with_Yes("housing", g.getHousingSelected());
    housingno = c.Fetch_probablty_with_Yes("housing", g.getHousingSelected());
    
    loanyes = f.probabilityOfYes();
    loanno = f.probabilityOfNO();
     
     
     double decision_yes = c.Naive_Biase_Classifier(1,jobyes , maritalyes, educationyes, housingyes, loanyes);
     double decision_no = c.Naive_Biase_Classifier(1,jobno , maritalno, educationno, housingno, loanno);
     
     
     String outcome = c.predict(decision_yes, decision_no);
     
    g.setOutCome(outcome);
    System.out.println( " yes = " +decision_yes +" no = "+ decision_no  +" lable ="+ outcome );
    
    



















    //f.getProbabilityWithYes("job");
    //f.getProbabilityWithnNo("job");
    //System.out.println(f.probabilityOfYes()+"   "+ f.probabilityOfNO() +" " + value );
//}
    }
    
}
