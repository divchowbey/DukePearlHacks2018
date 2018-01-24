import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class MemberCheck {
	 public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
		 TreeSet <String> dishonest = new TreeSet<String>(); 
		 dishonest.addAll(intersects(club1, club2)); 
		 dishonest.addAll(intersects(club1, club3)); 
		 dishonest.addAll(intersects(club2, club3));  
		 String [] ret = new String[dishonest.size()]; 
		 dishonest.toArray(ret); 
		 return ret;
		 }
		 
	 public TreeSet <String> intersects (String [] a, String [] b){
		 TreeSet<String> atree = new TreeSet<String>(Arrays.asList(a));
		 TreeSet<String> btree = new TreeSet<String>(Arrays.asList(b));
		 atree.retainAll(btree); 
		 return atree; 
		 
	 }
}
