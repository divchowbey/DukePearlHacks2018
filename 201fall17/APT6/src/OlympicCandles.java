import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OlympicCandles {
	public int numberOfNights(int[] candles) {

		List<Integer> myList = new ArrayList<Integer>();
		for (Integer a : candles) {
			myList.add(a);
		}
		int days = 0;
		while (myList.get(0) != 0) {
			Collections.sort(myList, Collections.reverseOrder());
			int i = 0;
			while (i <= days) {

				if (myList.get(i) <= 0) {
					break;
				}

				myList.set(i, myList.get(i) - 1);
				i++;
			}
			days++;

		}
		return days;
	}
}
