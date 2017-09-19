package main;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.collections4.map.MultiValueMap;

public class Recursion {
	
	 public static void main(String[] args) {

		Data s = new Data();
		s = getdetails();
		MultiValueMap subcounties = new MultiValueMap();
		MultiValueMap wards = new MultiValueMap();
		MultiValueMap counties = new MultiValueMap();
	    MultiValueMap subcountyid = new MultiValueMap();
		counties = s.getCounties();
		
		System.out.println(counties);
		subcounties = s.getSubcounties();
        wards = s.getWard();
		subcountyid = s.getSubcountyid();
		
		//first step is to get the id of the county
		
		System.out.println(counties.get("Kisumu"));
        // Now look for the subcounties with that id
		
		System.out.println(subcounties);
        
		System.out.println(subcounties.get("42"));
		//Got the subcounties under Kisumu
		
		//Now look for the wards under each of those subcounties
		//Lets say Kisumu East
		
		System.out.println(subcountyid.get("Kisumu East"));
		//Now look for wards with that subcounty id
		
		System.out.println(wards.get("285"));
      
        
        
        
        
        
        
        
		
		

	 }

	
public static Data getdetails(){
	 String csvFile = "C:/Users/Brian/eclipse-workspace/RecursionTestApi/src/main/records.csv";

     MultiValueMap map = new MultiValueMap();
     MultiValueMap map2 = new MultiValueMap();
     MultiValueMap map3 = new MultiValueMap();
     MultiValueMap map4 = new MultiValueMap();


    Data di = new Data();
	 try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	      String line;
	      while ((line = br.readLine()) != null) {
	    	 
	        String[] parts = line.split(",");
	        if (parts[2].equals("County")) {
	        	map3.put(parts[3],parts[0]);
	        }
	        else if (parts[2].equals("Sub-County")) {
	          // TODO: data.add, data.put, ...
	        	
	        	map.put(parts[1],parts[3]);
	        	map4.put(parts[3],parts[0]);
	          // ...
	        } else if (parts[2].equals("Ward")) {
	          // TODO: data.add, data.put, ...
	          // ...
	        	map2.put(parts[1], parts[3]);
	        }
	      }
	    } catch (FileNotFoundException ex) {
	      ex.printStackTrace();
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    }
	 
	   di.setSubcounties(map);
	    
	    di.setWard(map2);
	    di.setCounties(map3);
	    di.setSubcountyid(map4);
	   // System.out.println(map);
       return di;
	  }


     
    

}
