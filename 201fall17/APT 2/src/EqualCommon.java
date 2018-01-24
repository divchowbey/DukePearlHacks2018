import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class EqualCommon {
    
	
	public String[] matches(String[] a1, String[] a2) {
         TreeSet <String> vals = intersects(a1, a2); 
         ArrayList<String> count = new ArrayList<String>(); 
         for(String a: vals) {
        	 if (getCount(a1, a) == getCount(a2, a)) {
        		 count.add(a); 
        	 }
        	 
         }
         String [] ret = new String [count.size()];
         count.toArray(ret); 
		return ret; 
		
     }
	
	 public TreeSet <String> intersects (String [] a, String [] b){
		 TreeSet<String> atree = new TreeSet<String>(Arrays.asList(a));
		 TreeSet<String> btree = new TreeSet<String>(Arrays.asList(b));
		 atree.retainAll(btree); 
		 return atree; 
		 
	 }
	 
	 public int getCount (String[] values, String current) {
		 int count=0;

		       for (int j = 0; j < values.length; j++)
		           {
		             if (current.equals(values[j]))
		                {
		                  count++;
		                 }
		            }
		            
		    return count;
	 }
	
	
 }