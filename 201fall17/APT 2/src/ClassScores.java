import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassScores {
	 public int[] findMode(int[] scores) {
		 Arrays.sort(scores);
		 int max = 0;
         int thisMax =0; 
         ArrayList<Integer> modes = new ArrayList<Integer>();
        for(int i =0; i<scores.length; i++ ) {
         while(i<scores.length -1 && scores[i] == scores[i+1]) {
        	 thisMax ++;
        	 i++; 
         }
         if (thisMax> max) {
        	 max = thisMax;
        	 modes.clear();
        	 if(!modes.contains(scores[i])) {
        	 modes.add(scores[i]); 
        	 }
         }
         if (thisMax == max) {
        	 if(!modes.contains(scores[i])) {
        	 modes.add(scores[i]);
        	 }
         }
         thisMax= 0; 
         
        }
         int [] modeArray = new int [modes.size()];
        for(int j =0; j<modeArray.length; j++) {
        	modeArray[j] = modes.get(j).intValue(); 
        }
         return modeArray; 
     }
	 
	
}
