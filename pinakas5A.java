
public class pinakas5A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[]posa={2,4,6,7,86,54,4,5,9,78};
		double FPA=0.19;
		double posaFPA[]=new double[10];
		posaFPA=pinakas5.Ypologismos(posa,FPA);
		for (int i=0;i<posaFPA.length;i++){
			System.out.println(posaFPA[i]);
		}
	}

}
