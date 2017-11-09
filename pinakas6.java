import java.util.Arrays;


public class pinakas6 {
	
	public static boolean equalsArray(int[]a,int[]b){
		if (a.length!=b.length)
			return false;
		else{
			int i=0;
			while(i<a.length){
				if(a[i]!=b[i]){
					return false;
				}
				i++;

			}
			return true;
				
					
			}
	}

}
