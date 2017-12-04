
public class classofstaticmethods {
	
	static int trexonArithmosSyskeyhs=1;
	
	public static void fillPinInt(int[] a){
		a[0]=1;
		a[1]=1;
		for (int i=2;i<a.length;i++){
		
			a[i]=a[i-1]+a[i-2];
		}
		
		

	}

	public static double findSynolikoPosoPlhromhs(syskeyes[] a){
		double result=0.0;
		double result1=0.0;
		for (int i=0;i<a.length;i++){
			result=result+a[i].getArxikhTimhSyskeyhs();
			result1=result1+a[i].getTelikhTimhSyskeuhs();
		}
		System.out.println(result);
	
		
		if (result>2000){
			double ektosi=result1*0.3;
			result1=result1-ektosi;
		}
		
		return result1;
	}

}

		    
	

