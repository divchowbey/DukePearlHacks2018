import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortedFreqs {
	public int[] freqs(String[] data) {
		List<String> list = Arrays.asList(data);
		TreeSet<String> mySet = new TreeSet<String>();
		for (String a : data) {
			mySet.add(a);
		}
		int[] ret = new int[mySet.size()];
		int i = 0;
		for (String c : mySet) {
			ret[i] = Collections.frequency(list, c);
			i += 1;
		}
		return ret;
	}
}
