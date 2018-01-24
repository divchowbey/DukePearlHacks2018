
	public class Totality {

		public int sum (int [] a, String stype) {
			if(stype.equals("all")) {
			int total =0;
			for (int k=0; k< a.length; k+=1) {
				total = total + a[k];
			}
			return total; 
		}
			
			if(stype.equals("even")) {
				int total =0;
				for (int k=0; k< a.length; k+=2) {
					total = total + a[k];
				}
				return total; 
			}
			if(stype.equals("odd")) {
				int total =0;
				for (int k=1; k<a.length; k+=2) {
					total += a[k]; 
				}
				return total;
			}
			return -1; 
	}
	

}

