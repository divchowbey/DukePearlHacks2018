
public class App {
	public static void main(String[] args) {
		SortByFreqs myTest = new SortByFreqs();
		String[] a = { "zat", "ban", "zat", "dog" };
		String[] c = myTest.sort(a);
		for (String b : c) {
			System.out.print(b);
		}
	}

}
