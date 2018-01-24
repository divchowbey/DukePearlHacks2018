import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Intersection {
     public String matches(String[] entries) {
    	 if(entries.length ==0) {
    		 return null;
    	 }
    	 if(entries.length ==1) {
    		 return entries[1]; 
    	 }
    	
    	 String [] words1 = entries[0].split(" "); 
    	 String [] words2 = entries[1].split(" ");
    	 TreeSet <String> common = intersects(words1, words2);
    	 
    	 
    	 
         for(int i =1; i<entries.length; i++) {
        	 String [] w1 = entries[i].split(" "); 
        	 TreeSet <String> current = intersects(common, w1); 
        	 common.retainAll(current); 
        	 }
         if (common.size()==0) {
        	 return ""; 
         }
         return printer(common);
    	 }
    	
         
         
     
    public String printer(TreeSet <String> a) {
    	String ret = ""; 
    	for(String mine: a) {
    		ret += mine; 
    		ret += " "; 
    	}
    	String returner = ret.substring(0, ret.length()-1); 
    	return returner; 
    }
     
     public TreeSet <String> intersects (String [] a, String [] b){
		 TreeSet<String> myA = new TreeSet<String>(Arrays.asList(a));
		 TreeSet<String> myB = new TreeSet<String>(Arrays.asList(b));
		 myA.retainAll(myB); 
		 return myA; 
	 }
     
     public TreeSet <String> intersects (TreeSet<String>a, String []b){
    	 TreeSet<String> myB = new TreeSet<String>(Arrays.asList(b));
    	 a.retainAll(myB); 
    	 return a; 
     }
 }
