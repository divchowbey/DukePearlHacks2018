import java.util.TreeMap;

public class LeafTrails {
	static TreeMap<Integer, String> list;

	public String[] trails(TreeNode tree) {
		list = new TreeMap<Integer, String>();
		findLeaves(tree, "");
		String[] ret = new String[list.size()];
		int i = 0;
		for (String a : list.values()) {
			ret[i] = a;
			i++;
		}
		return ret;

	}

	public static void findLeaves(TreeNode tree, String path) {
		if (tree == null) {
			return;
		}
		if (tree.right == null && tree.left == null) {
			list.put(tree.info, path);
		} else {
			findLeaves(tree.left, path + "0");
			findLeaves(tree.right, path + "1");
		}
	}
}
