import java.util.HashSet;

public class UniqueNewYork {
       public int seen(String[] records) {
           HashSet <String> ret = new HashSet <String>(); 
    	   for(int i =0; i<records.length; i++) {
    		   String [] adder = records[i].split(","); 
    		   for (int k =0; k<adder.length; k++) {
    			   if(! ret.contains(adder[k])) {
    				   ret.add(adder[k]); 
    			   }
    		   }
    	   }
    	   return ret.size(); 
       }
   }