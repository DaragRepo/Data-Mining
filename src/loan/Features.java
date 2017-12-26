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
public class Features {
     private List<DataSet> all_features ; // all features and label
     private String name ; // name of the feature that i want to extract 

    public Features(List<DataSet> all_features, String name) {
        this.all_features = all_features;
        this.name = name;
    }
    public List<SeperateFeatures> getFeature(){
        List<SeperateFeatures> list = new ArrayList<SeperateFeatures>();
        int i = 0 ;
        for (DataSet d : all_features){
         SeperateFeatures f =new SeperateFeatures(d.getName(this.name),d.label);
         list.add(f);
   
        }
      return list;
    }
     public int countAllYes(){
         int count = 0 ; 
       for (DataSet d : all_features){
           if (d.label.contains("yes")){
           count++;
           
       }
       }
       return count ; 
     }
      public int countAllNo(){
         int count = 0 ; 
       for (DataSet d : all_features){
           if (d.label.contains("no")){
           count++;
           
       }
       }
       return count ; 
     }
 
     
    
    
    
    
}
