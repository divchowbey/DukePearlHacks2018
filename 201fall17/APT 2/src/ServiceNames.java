import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ServiceNames {
	public String[] makeList(String[] services) {
	   
		TreeMap <String, ArrayList<String>> mine = new TreeMap<>(); 
       for (String a: services) {
        String [] myArray  = a.split(" "); 
        ArrayList<String> bioservice = new ArrayList<String>();
        bioservice.add(myArray[0]); 
        if(myArray.length>1) {
        for(int i = 1; i<myArray.length; i++) {
        	if(!mine.containsKey(myArray[i])) { 
        	mine.put(myArray[i], bioservice); //put first occurrence of kindOfInput in map
        	} 
        	else {
        		ArrayList <String> edit = arrangeEnds(mine.get(myArray[i]), bioservice);
        		mine.put(myArray[i], edit); 
        		
        	}
        }
        }
       }
       String [] ret = returner(mine); 
      
       return ret; 
    }
	
	public ArrayList <String> arrangeEnds (ArrayList<String> all, ArrayList <String> put) {
		ArrayList <String> myList = new ArrayList <String>();
		for(String a: all) {
			myList.add(a); 
		}
		for(String z: put) {
			myList.add(z); 
		}
		Collections.sort(myList);
		return myList; 
	
		
	}

	
	public String [] returner (TreeMap<String, ArrayList <String>> converter) {
		String [] ret = new String[converter.size()]; 
		int i =0; 
		for (Map.Entry<String, ArrayList <String>> entry : converter.entrySet()) {
			if (i<ret.length) {
				String mine = entry.getKey() + " ==> ";
				for(String a : entry.getValue()) {
					mine += a +", "; 
				}
				ret [i] = mine.substring(0, mine.length()-2); 
				
				i++; 
			}
			
			
		}
		return ret; 
		
	}
	
	
}
