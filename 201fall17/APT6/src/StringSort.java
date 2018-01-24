import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {
	public String[] sort(String[] data) {

		ArrayList<String> sorter = new ArrayList<String>();
		for (String c : data) {
			sorter.add(c);
		}

		Comparator<String> comp = new Comparator<String>() {
			@Override

			public int compare(String v, String w) {
				if (v.length() == w.length()) {
					return v.compareTo(w);
				}
				return v.length() - w.length();
			}
		};
		Collections.sort(sorter, comp);

		String[] ret = new String[sorter.size()];
		int i = 0;
		for (String a : sorter) {
			ret[i] = a;
			i++;
		}
		return ret;

	}
}
