
public class ASKISI4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="CATADDKLDACATLJACAT";
		String s1="CAT";
		
		int sizetos=s.length();
		int result=0;
		
		if (sizetos>=0){
			int e=s.indexOf(s1);
			
			while (e!=-1){
				result++;
				e=s.indexOf(s1,e+1);
				System.out.println(e);
			}
		}
		int i=result;
		System.out.println(result);
		
	
	}

}
