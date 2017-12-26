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
public class DataSet {
    public int age ; 
    public String job ; 
    public String marital ; 
    public String education ; 
     public String housing; 
      public String label ;
     
    public DataSet(int age, String job, String marital, String education, String housing, String label) {
        this.age = age;
        this.job = job;
        this.marital = marital;
        this.education = education;
        this.housing = housing;
        this.label = label;
    }

    public String getName(String name){
    if (name=="age"){
        return String.valueOf(this.age) ;
    } else if (name=="job"){
        return  this.job;
    } else if (name=="marital"){
        return  this.marital;
    } else if (name=="education"){
        return  this.education;
    }  else if (name=="housing"){
        return  this.housing;
    }
        return null;
            
    }
    
    
}
