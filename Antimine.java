
public class Antimine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mine rouxa[]=new Mine[2];
		
		rouxa[0]= new Mine(12.5,15.0,3401);
		rouxa[1]=new Mine(35.4,19.0,6020);
		
		for(int i=0;i<rouxa.length;i++){
		rouxa[i].getLastcost();
		System.out.println(rouxa[i]);
		
		}
		
		
		
	}

}