import java.util.*;
import java.io.*;
public class askisi11 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		ArrayList <Integer> mylist=new ArrayList <Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dwste noumera");
		int a=Integer.parseInt(br.readLine());
		mylist.add(2);
		mylist.add(1234);
		mylist.add(223);
		mylist.add(52);
		mylist.add(69);
		mylist.add(107);
		
		System.out.println("H lista prin tin kataxorisi: "+mylist);
		Collections.sort(mylist);
		System.out.println("H lista meta apo tin kataxorish: "+mylist);
	}

}
