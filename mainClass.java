

public class mainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] intPin=new int[10];
		classofstaticmethods.fillPinInt(intPin);
		
		for (int i =0;i<intPin.length;i++){
			System.out.println(intPin[i]);
			
		}
		System.out.println("-----------------------");
		
		
		int n=3;
		syskeyes syskPin[]=new syskeyes[n];
				
		syskPin[0]=new syskeyes();
		syskPin[0].setArithmosSyskeyhs(n);
		syskPin[0].setArxikhTimhSyskeyhs(12.5);
		syskPin[0].setTelikhTimhSyskeyhs(2000.0);
		
		syskPin[1]=new syskeyes();
		syskPin[1].setArithmosSyskeyhs(n);
		syskPin[1].setArxikhTimhSyskeyhs(34.8);
		syskPin[1].setTelikhTimhSyskeyhs(190.4);
		
		syskPin[2]= new syskeyes(n,35,234.8);
		

		for (int i=0;i<syskPin.length;i++){
			double a=classofstaticmethods.findSynolikoPosoPlhromhs(syskPin);
			System.out.println(syskPin[i]+"H telikh timh einai :"+a);
		}
	}
}
	

