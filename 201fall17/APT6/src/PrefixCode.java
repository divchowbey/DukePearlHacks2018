import java.util.ArrayList;

public class PrefixCode {
	public String isOne(String[] words) {
		ArrayList<String> myWords = new ArrayList<String>();
		ArrayList<String> sorter = new ArrayList<String>();
		for (String a : words) {
			myWords.add(a);
			sorter.add(a);
		}
		for (int pre = 0; pre < myWords.size(); pre++) {
			for (int word = 0; word < myWords.size(); word++) {
				if (word != pre) {
					if (isPrefixOf(myWords.get(pre), myWords.get(word))) {
						return "No, " + myWords.indexOf(myWords.get(pre));
					}
				}
			}
		}
		return "Yes";
	}

	public boolean isPrefixOf(String pre, String word) {
		if (pre.length() > word.length()) {
			return false;
		}
		if (word.substring(0, pre.length()).equals(pre)) {
			return true;
		}
		return false;
	}
}