/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author moh
 */
public class Attributes {
    private HashMap<String,Integer> h  =new HashMap();
    public Attributes (String call_yes_or_no,ArrayList<SeperateFeatures> givenArray){
       if (call_yes_or_no.equals("yes")){
          this.h=  countElementsWithYes(givenArray);
       } else if (call_yes_or_no.equals("no")){
           this.h= countElementsWithNo(givenArray);
       } else {
           System.out.println("something is not right");
       }
    }
     private  HashMap<String, Integer> countElementsWithYes(ArrayList<SeperateFeatures> givenArray) {
        
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for (SeperateFeatures i : givenArray) {
            if (i.label.contains("yes")){
            if (count.containsKey(i.feature)) {
                
                Integer newVal = count.get(i.feature) + 1;
                count.put(i.feature, newVal);
            } else {
                count.put(i.feature, 1);
            }
            }
        }
        //System.out.println(count.keySet()+" "+count.values());
        return count;
    }
      private  HashMap<String, Integer> countFeatures(ArrayList<SeperateFeatures> givenArray) {
        
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for (SeperateFeatures i : givenArray) {
            
            if (count.containsKey(i.feature)) {
                
                Integer newVal = count.get(i.feature) + 1;
                count.put(i.feature, newVal);
            } else {
                count.put(i.feature, 1);
            }
            
        }
        //System.out.println(count.keySet()+" "+count.values());
        return count;
    }
 private  HashMap<String, Integer> countElementsWithNo(ArrayList<SeperateFeatures> givenArray) {
        
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for (SeperateFeatures i : givenArray) {
            if (i.label.contains("no")){
            if (count.containsKey(i.feature)) {
                
                Integer newVal = count.get(i.feature) + 1;
                count.put(i.feature, newVal);
            } else {
                count.put(i.feature, 1);
            }
            }
        }
      //  System.out.println(count.keySet()+" "+count.values());
        return count;
    }
  public HashMap<String,Integer> getHash(){
      return this.h;    // this returns each attribute of the feature and it's count with yes or no that i gave it to the facade function in the first place 
  }
}
