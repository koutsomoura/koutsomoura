
public class classofstaticmethods {
	
	static int trexonArithmosSyskeyhs=1;
	
	public static void fillPinInt(int[] a){
		a[0]=1;
		a[1]=1;
		for (int i=2;i<a.length;i++){
		
			a[i]=a[i-1]+a[i-2];
		}
		for (int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}
		

	}
	int n=trexonArithmosSyskeyhs;

	public double findSynolikoPosoPlhromhs(double[]a,double telikhTimhSyskeyhs){
		double []k=new double[n];
		double result=0;
		
		for (int i=1;i<n;i++){
			result+=k[i];
		}
		
		double arxikestimes[]=new double[1];
		System.arraycopy(k,1,arxikestimes,1,1);
		double result1=0;
		
		for(int i=0;i<arxikestimes.length;i++){
		result1+=result+arxikestimes[i];
		}
		
		double telikestimes[]=new double[1];
		System.arraycopy(k, 2, telikestimes, 2, 1);
		double result3=0;
		
		for(int i=0;i<telikestimes.length;i++){
			result+=telikestimes[i];
		}
		
		if(n>=1&&result1>2000){
		double ektosi=result3*(30.0/100.0);
		result3=result3-ektosi;
			
		}	
		
		telikhTimhSyskeyhs=result3;
		return telikhTimhSyskeyhs;
	}

}

		    
	

