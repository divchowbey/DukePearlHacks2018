import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
	
	public int points(String[] player, String[] dictionary) {
		int points = 0; 
		HashSet<String> dict = convHash(dictionary);
		HashSet<String> play = convHash(player); 
		for(String a: play) {
			if(dict.contains(a)) {
				points += Math.pow(a.length(), 2); 
			}
		}
		return points; 
}
	public HashSet<String> convHash (String [] str){
		HashSet<String> mine = new HashSet<String>(Arrays.asList(str));
		return mine; 
	}

	
}
