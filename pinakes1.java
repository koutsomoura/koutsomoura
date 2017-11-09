import java.lang.System;
import java.util.Arrays;
public class pinakes1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]a1={'R','w','W','T','A'};
		char[]b1={'C','A','S','y'};
		System.arraycopy(a1,3,b1,2,2);
		System.out.println(b1);
		
		
		int ar[] = {0,0,0,0,0,0,0,0,0,0};
		for(int i= 0;i< 10; ++i) {		/*gt den ta bgazei anapoda*/
		System.arraycopy(ar,0,ar,1,9);
		ar[0] = i;
		}
		System.out.print("ar = ");
		for (int i = 0; i < 10; ++i) {
		System.out.print(ar[i] + " ");
		}
		System.out.println("");
		
		int array1[]=new int[5];
		String array2[]=new String[5];
		Arrays.fill(array1,20);
		Arrays.fill(array2, "Java");
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
		}
		for(int i=0;i<array2.length;i++){
		System.out.println(array2[i]);	
		}
		Arrays.fill(array1,1,3,56);
		for (int i=0;i<array1.length;i++){			
			System.out.println(array1[i]);
		}
		
		String[] names={"Anna","Koula","Efh"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		char[]abc={'a','c','s','f','b','e'};
		Arrays.sort(abc);
		System.out.println(Arrays.toString(abc));
	
	}

}
