package com.licagent;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJson {

	public static void main(String[] args) throws ParseException {
		 //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("C:\\Users\\srinivas\\Downloads\\JSONSimpleExamples\\employees.json"))
        {
            //Read JSON file
            Object obj = null;
			try {
				obj = jsonParser.parse(reader);
			} catch (org.json.simple.parser.ParseException e) {
				
				e.printStackTrace();
			}
 
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee) 
    {
        //Get employee object within list
       // JSONObject employeeObject = (JSONObject) employee.get("employee");
    	 Date d=new Date();  
         Long year=(long) d.getYear();  
         Long currentYear=year+1900;  
         System.out.println("currentYear===="+currentYear);
    	Long yearofJoing = (Long) employee.get("Year Of Joining");    
    	int experience=(int) (currentYear-yearofJoing);
    	//  System.out.println("input===="+X);
         if(6 <= experience)
         {
        	 System.out.println(yearofJoing);
       
    	   
        //Get employee first name
        Long EmpId =   (Long) employee.get("Emp ID");    
        System.out.println(EmpId);
         
        //Get employee last name
        String NamePrefix = (String) employee.get("Name Prefix");  
        System.out.println(NamePrefix);
         
        //Get employee website name
        String firstName = (String) employee.get("First Name");    
        System.out.println(firstName);
        
        //Get employee first name
        String  Middleinitial =   (String) employee.get("Middle Initial");    
        System.out.println(Middleinitial);
         
        //Get employee last name
        String Lastname = (String) employee.get("Last Name");  
        System.out.println(Lastname);
         
        //Get employee website name
        String Email = (String) employee.get("E Mail");    
        System.out.println(Email);
        
        //Get employee website name
        String dateOfBirth = (String) employee.get("Date of Birth");    
        System.out.println(dateOfBirth);
       
         yearofJoing = (Long) employee.get("Year Of Joining");    
       System.out.println(yearofJoing);
        System.out.println("\t");
         }
    }

	}


