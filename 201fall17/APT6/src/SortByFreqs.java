import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortByFreqs {
	public String[] sort(String[] data) {

		HashMap<String, Integer> allVals = new HashMap<String, Integer>();
		for (String c : data) {
			if (allVals.containsKey(c)) {
				allVals.replace(c, allVals.get(c) + 1);
			} else {
				allVals.put(c, 1);
			}
		}
		// System.out.print(allVals.toString());

		// fill in code here
		ArrayList<String> mine = new ArrayList<String>();
		for (String a : data) {
			if (!mine.contains(a)) {
				mine.add(a);
			}
		}

		Comparator<String> comp = new Comparator<String>() {
			@Override

			public int compare(String v, String w) {
				if (allVals.get(v) == allVals.get(w)) {
					return v.compareTo(w);
				}
				return allVals.get(w) - allVals.get(v);
			}
		};
		Collections.sort(mine, comp);

		String[] ret = new String[mine.size()];
		int i = 0;
		for (String a : mine) {
			ret[i] = a;
			i++;
		}
		return ret;

	}
}