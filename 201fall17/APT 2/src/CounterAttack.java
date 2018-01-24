import java.util.ArrayList;

public class CounterAttack {
     public int[] analyze(String str, String[] words) {
        
    	 String [] count = str.split(" "); 
    	 ArrayList<Integer> returner = new ArrayList<Integer>(); 
    	 for(int i =0; i<words.length; i++) {
    		 returner.add(find(count, words[i]));
    	 }
    	 
    	 int [] ret = new int [returner.size()];
    	 for(int k =0; k<returner.size(); k++) {
    		 ret[k] = returner.get(k); 
    	 }
    	 return ret; 
     }
     
     
     public int find(String [] count, String find) {
    	 int counter = 0; 
    	 for(int i=0; i<count.length; i++) {
    		 if(count[i].equals(find)) {
    			 counter ++; 
    		 }
    	 }
    	 return counter; 
     }
 }
