/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moh
 */
public class FileReader {
 private String fileName;
    public FileReader (String fileName){
        this.fileName = fileName;
    }
     public  List<DataSet> readCsvFile(){
        //Delimiters used in the CSV file
     String COMMA_DELIMITER = ",";
     int count = 0 ;
         List<DataSet> empList = new ArrayList<DataSet>();
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new java.io.FileReader(this.fileName));
            
            //Create List for holding Employee objects
      
            
            String line = "";
            //Read to skip the header
           br.readLine();
            //Reading from the second line
                   
            while ((line = br.readLine()) != null) 
            {
                String[] employeeDetails = line.split(COMMA_DELIMITER);
                
                if(employeeDetails.length > 0 )
                {
                    //Save the employee details in Employee object
                    DataSet emp = new DataSet(Integer.parseInt(employeeDetails[0]),
                            employeeDetails[1],employeeDetails[2],
                          employeeDetails[3],employeeDetails[4],employeeDetails[5]);
                    empList.add(emp);
                }
            }

        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
   
 return empList;
    }
    
}
