import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class IsomorphicWords {

	 public int countPairs(String[] words) {
         // fill in code here
		 int counter =0; 
		for(int i =0; i<words.length; i++) {
			for( int k = i+1; k<words.length; k++) {
				 if (i!=k){
					 if  (checkEqual(words[i], words[k])){
						 counter ++; 
					 }
					 
				 }
			 }
		 }
		 return counter; 
      }
	
	 public boolean checkEqual(String a, String b) {
		 ArrayList<String> first = convArray(a);
		 ArrayList<String> second = convArray(b); 
		 if (convInt(first).equals(convInt(second))){
			 return true; 
		 }
		 
		 return false; 
		 
	 }
	 
	 
	 public ArrayList<String> convArray(String first){
		 ArrayList<String> arrayList = new ArrayList<String>();
		 for (int i =0; i<first.length(); i++) {
			 arrayList.add(first.substring(i, i+1)); 
		 }
		  return arrayList; 
	}
	 
	 public ArrayList<String> convInt (ArrayList <String> a) {
			 for(int i=0; i<a.size(); i++) {
				 String current = a.get(i);
				 String index = ""+ i; 
				 if(Character.isLetter(a.get(i).charAt(0))) {
					 Collections.replaceAll(a, current,index);
				 
			 }
		 
		 }
			 return a; 
	 }
}

