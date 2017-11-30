
public class antiMine2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mine2 []stoixeia =new Mine2 [3];
		
		stoixeia[0]=new Mine2(234,"G.KARAS","AP32");
		
		stoixeia[1]=new Mine2(007,"A.APOL","F8P0");
		stoixeia[2]=new Mine2(123,"E.EL","KO17");
		

		for (int i=0;i<stoixeia.length;i++){
			stoixeia[i].getAllname();
			
			System.out.println(stoixeia[i]+"Apostoles :"+stoixeia[i].getApostoles());
		}
		
		
	}

}
