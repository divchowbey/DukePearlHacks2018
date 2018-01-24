
public class SandwichBar {
	
	public int whichOrder(String[] available, String[] orders){
		for (int i =0; i<orders.length; i++) {
			String[] splited = orders[i].split(" ");
			int counter =0; 
			for(int j=0; j<splited.length; j++) {
				if (!(contained(splited[j], available))) {
					counter = 0;
					continue;
				}
				if(contained(splited[j], available)){
					counter ++; 
				}
			}
			if (counter == splited.length) {
				return i; 
			}
			}
		
		return -1; 
		
	}
	
	public boolean contained (String a, String [] b) { //checks if array b contains a
		for(int i =0; i<b.length; i++) {
			if(b[i].equals(a)) {
				return true; 
			}
		}
		return false; 
	}
	
	}

