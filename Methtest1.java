
public class Methtest1 {

	public static int[] p(int a[]){
		for (int i=0;i<a.length;i++){
			if (a[i]%2==0){
				a[i]=0;
			}
			else{
				a[i]=1;
			}
		}
		return a;
	}		
		


}
