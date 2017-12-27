/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;


/**
 *
 * @author moh
 */
public class Loan {
   


    public static void main(String[] args){
//    Facade f =new Facade("no","age"); 
//        System.out.println(f.getYesOrNo()); // i gave it yes so it will return all the age with yes 
//              System.out.println(f.countAllYes()); // this is to count all the yes in the data set 
//                
//        
//                
// my main 
    FeatureProbability f = new FeatureProbability();
    Classifier c = new Classifier();
    
    double ageyes,ageno,jobyes,jobno,maritalyes,maritalno,educationyes,educationno,housingyes,housingno,loanyes,loanno ;
   // ageyes = c.Fetch_probablty_with_Yes(, null);
    
    jobyes = c.Fetch_probablty_with_Yes("job","management" );
    jobno = c.Fetch_probablty_with_No("job", "management");
   
    maritalyes = c.Fetch_probablty_with_Yes("marital", "married");
    maritalno = c.Fetch_probablty_with_No("marital", "married");
     
    educationyes = c.Fetch_probablty_with_Yes("education", "tertiary");
    educationno = c.Fetch_probablty_with_No("education", "tertiary");
     
    housingyes = c.Fetch_probablty_with_Yes("housing", "yes");
    housingno = c.Fetch_probablty_with_Yes("housing", "yes");
    
    loanyes = f.probabilityOfYes();
    loanno = f.probabilityOfNO();
     
     
     double decision_yes = c.Naive_Biase_Classifier(1,jobyes , maritalyes, educationyes, housingyes, loanyes);
     double decision_no = c.Naive_Biase_Classifier(1,jobno , maritalno, educationno, housingno, loanno);
     
     
     String outcome = c.predict(decision_yes, decision_no);
     
    
    System.out.println( " yes = " +decision_yes +" no = "+ decision_no  +" lable ="+ outcome );
    
    



















    //f.getProbabilityWithYes("job");
    //f.getProbabilityWithnNo("job");
    //System.out.println(f.probabilityOfYes()+"   "+ f.probabilityOfNO() +" " + value );
//}
    }
    
}
