import java.io.*;
public class pinakes2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int array[];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Doste to plithos tou pinaka: ");
		int plithos=Integer.parseInt(br.readLine());
		array=new int[plithos];
		
		int i;
		for (i=0;i<array.length;i++){
			System.out.print("Dwse times sta kelia ");
			array[i]=Integer.parseInt(br.readLine());
		}
		for (i=0;i<array.length;i++){
			System.out.print("To keli ["+i+"] exei timi "+array[i]);
			System.out.println();
		}
	}

}
