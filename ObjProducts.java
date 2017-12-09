import java.util.Arrays;


public class ObjProducts {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products a[]=new Products[3];
		a[0]=new Products();
		a[0].setCode(24234);
		a[0].setKf(2);
		a[0].setFcost(2);
		a[0].setLcost(3);
		a[0].setTemaxia(4);
		
		double sum=a[0].getSinolo();

		System.out.println(a[0].toString()+"Sinolo: "+sum);
	}

}
