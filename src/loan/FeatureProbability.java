/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author moh
 */
public class FeatureProbability {
   
   Facade f  = new Facade("yes", "job");
   double counter = f.returncounter() ;
    
    public HashMap<String,Double> getProbabilityWithYes(String name ){
       HashMap<String,Double> probabilityYes = new HashMap();
       
        Facade fa = new Facade("yes",name );
        
        String  fes ;
        String temp ;
        double some = 0 ;
        double countyes =fa.countAllYes();
        
      HashMap<String,Integer> h = fa.getYesOrNo();
       Iterator it = h.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        fes = (String) pair.getKey();
        temp = pair.getValue().toString();
        some = Double.parseDouble(temp)/countyes;
        probabilityYes.put(fes, some);
       // System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
       // System.out.println(probabilityYes);
        return probabilityYes;
        
    }
        public HashMap<String,Double> getProbabilityWithnNo(String name ){
       HashMap<String,Double> probabilityNo = new HashMap();
       
        Facade fa = new Facade("no",name );
        
        String  fes ;
        String temp ;
        double some = 0 ;
        double countyes =fa.countAllYes();
        
      HashMap<String,Integer> h = fa.getYesOrNo();
       Iterator it = h.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        fes = (String) pair.getKey();
        temp = pair.getValue().toString();
        some = Double.parseDouble(temp)/countyes;
        probabilityNo.put(fes, some);
       // System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
        //System.out.println(probabilityNo+" "+ counter);
        return probabilityNo;
        
    }
        
        public double probabilityOfYes(){
           
             
            
            return f.countAllYes()/counter;
            
        }
        
    
            public double probabilityOfNO(){
                
                return f.countAllNo()/counter;
            
        }
        
  
}
