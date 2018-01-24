import java.util.ArrayList;
import java.util.Collections;

//import javax.swing.tree.TreeNode;

//import javax.swing.tree.TreeNode;

public class SortedLeaves {
	static ArrayList<Integer> list;

	public String[] values(TreeNode tree) {
		list = new ArrayList<Integer>();
		findLeaves(tree);
		Collections.sort(list);
		String ret[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ret[i] = "" + (char) list.get(i).intValue();
		}
		return ret;
	}

	public static void findLeaves(TreeNode tree) {
		if (tree == null) {
			return;
		}
		if (tree.right == null && tree.left == null) {
			list.add(tree.info);
		} else {
			findLeaves(tree.left);
			findLeaves(tree.right);
		}
	}
}
