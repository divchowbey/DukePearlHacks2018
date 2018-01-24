import java.util.ArrayList;
import java.util.HashMap;

public class Anonymous {
	
	public int howMany(String[] headlines, String[] messages) {
		int counter =0;
		String [] edited = edit(messages);
		for(int i=0; i<edited.length; i++) {
			if(canBeMade(convHead(headlines), edited[i].toLowerCase())) {
				counter++;
			}
		}
		return counter; 

	}
	
	public String [] edit (String[] messages) {
		String [] edited = new String [messages.length];
		for(int i =0; i<messages.length; i++) {
			edited[i] = messages[i].replace(" ", ""); 
		}
		return edited; 
	}

	
  public HashMap<Character, Integer> convHead (String[] lines){
	  HashMap<Character, Integer> ret = new HashMap <Character, Integer>();
	  String total = ""; 
	  for(int i=0; i<lines.length; i++) {
		  lines[i] = lines[i].toLowerCase(); 
		  total += lines[i];
	  }
	  total = total.replace(" ", "");
	  char[] chars= total.toCharArray();
	  
	  for(char a: chars) {
		  if(ret.containsKey(a)) {
			  ret.put(a, ret.get(a)+1);
		  }
		  else {
			  ret.put(a, 1); 
		  }
	  }
	  return ret; 
}
  
  
  
  public boolean canBeMade (HashMap<Character, Integer> headlines, String messages) {
	  for(int i=0; i<messages.length(); i++) { //parses through string message
		  char c = messages.charAt(i); //checks element i
		  if(headlines.containsKey(c) && (headlines.get(c) >0 )) { //checks if headlines contains i
			  headlines.put(c, headlines.get(c)-1 ); //changes the value of char if it can be used
		  }
		  else {
			  return false; //exit if it can't be made 
		  }
	  }
	  return true; 

  }
}

	

