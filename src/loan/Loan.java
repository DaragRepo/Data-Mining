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


    Gui g  =new Gui();    
  
    
    FeatureProbability f = new FeatureProbability();
    Facade fa = new Facade("yes", "job");
    
    
    
    f.getProbabilityWithYes("job");
    f.getProbabilityWithnNo("job");
   System.out.println(fa.countAllYes());
    System.out.println(f.getProbabilityWithYes("job")+" "+ f.getProbabilityWithnNo("job")+ "  yes  " + f.probabilityOfYes() +"no" + f.probabilityOfNO()  );
//}
    }
    
}
