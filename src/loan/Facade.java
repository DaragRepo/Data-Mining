/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author moh
 */
public class Facade {
    private List<DataSet> list ; 
   private List<SeperateFeatures> l;
   private Features f; 
   private   Attributes atrr;
   public  double counter ;// yes , whatever 
    public Facade (String yes_or_no,String feature_name){

        FileReader file = new FileReader("C:\\Users\\max22\\Desktop\\bank-full.csv");

        

        
     this.list =   file.readCsvFile();
        this.f =new Features(this.list, feature_name);
         this.l =f.getFeature();
         this.counter= file.counter;
        this.atrr = new Attributes(yes_or_no, (ArrayList<SeperateFeatures>) this.l);
    }
    public HashMap<String,Integer> getYesOrNo(){
        return this.atrr.getHash();
    }
    public double countAllYes(){
        return this.f.countAllYes();
    }
    public double countAllNo(){
        return this.f.countAllNo();
    }
    

    public  double returncounter (){
        
     return counter;
    }
    

    
}
