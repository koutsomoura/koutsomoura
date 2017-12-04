

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
		
		
		syskeyes syskPin[]=new syskeyes[3];
				
		syskPin[0]=new syskeyes();
		syskPin[0].setArxikhTimhSyskeyhs(2000.5);
		syskPin[0].setTelikhTimhSyskeyhs(2000.0);
		
		syskPin[1]=new syskeyes();
		syskPin[1].setArxikhTimhSyskeyhs(34.8);
		syskPin[1].setTelikhTimhSyskeyhs(100.0);
		
		syskPin[2]= new syskeyes(classofstaticmethods.trexonArithmosSyskeyhs,234,400.0);
		
		
		for (int i=0;i<syskPin.length;i++){

			System.out.println(syskPin[i]);
		}				
		double a=classofstaticmethods.findSynolikoPosoPlhromhs(syskPin);
		System.out.println("Apotelesmata: "+a);
		
	}
}
	

