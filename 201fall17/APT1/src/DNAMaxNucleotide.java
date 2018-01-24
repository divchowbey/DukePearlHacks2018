
public class DNAMaxNucleotide {
	 public String max(String[] strands, String nuc) {
        int max = 0;
     
        int maxPos = 0; 
        boolean contains = false; 
        for(int i=0; i< strands.length; i++) { // parse through the list
        	int thisMax = 0; 
        	for(int j =0; j<strands[i].length(); j++) { //parse through each letter in the string 
        		if (strands[i].charAt(j) == (nuc.charAt(0))) {
        			thisMax ++; 
        	        contains = true;
        		}
        	}
        	if(thisMax > max) {
    			max = thisMax; 
    			maxPos = i; 
    		    }
        	if ((thisMax == max)) {
        		if (strands[i].length()> strands[maxPos].length()) {
        			maxPos = i;
        		}
        	}
     
        }
        if(! contains) {
        	return "";
        }
        return strands[maxPos];
   }

}
