
public class Bp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PinakasBoX pinaka[]=new PinakasBoX[3];
		
		pinaka[0]=new PinakasBoX(10,20,15);
		pinaka[1]=new PinakasBoX(3,6,9);
		pinaka[2]=new PinakasBoX(4,5,6);
		
		double Volume[]=new double[3];
		Volume=PinakasBoX.volume(pinaka);
		for (int i=0;i<3;i++){
			System.out.println("O ogkos toy box ["+i+"] einai "+Volume[i]);
		}
	
	
	
	}

}
