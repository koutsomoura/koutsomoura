
public class classofstaticmethods {
	
	static int trexonArithmosSyskeyhs=1;
	
	public static void fillPinInt(int[] a){
		a[0]=1;
		a[1]=1;
		for (int i=2;i<a.length;i++){
		
			a[i]=a[i-1]+a[i-2];
		}
		
		

	}
	static int n=trexonArithmosSyskeyhs;

	public static double findSynolikoPosoPlhromhs(syskeyes[] a){
		
		
		double arxikestimes[]=new double[1];
		double result1=0;
		
		for(int i=0;i<a.length;i++){
		System.arraycopy(a,1,arxikestimes, 0, 1);
		result1+=arxikestimes[i];
		}
		
		double telikestimes[]=new double[1];
		double result2=0;
		
		for(int i=0;i<a.length;i++){
			System.arraycopy(a, 2, telikestimes, 0, 1);
			result2+=telikestimes[i];
		}
		
		if(a.length>=1&&result1>2000){
		double ektosi=result2*(30.0/100.0);
		result2=result2-ektosi;
			
		}	
		double telikhTimhSyskeyhs;
		telikhTimhSyskeyhs=result2;
		return telikhTimhSyskeyhs;
	}

}

		    
	

