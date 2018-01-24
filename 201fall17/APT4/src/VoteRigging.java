import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VoteRigging {
	public int minimumVotes(int[] votes) {
		if (votes.length == 1) {
			return 0;
		}
		List<Integer> list = new ArrayList<>();
		for (int v : votes)
			list.add(v);
		List<Integer> others = list.subList(1, list.size());
		int vpfv = 0;
		while (list.get(0) <= Collections.max(others)) {
			Collections.sort(others, Collections.reverseOrder());
			list.set(0, list.get(0) + 1);
			list.set(1, list.get(1) - 1);
			vpfv += 1;
		}
		return vpfv;
	}
}
