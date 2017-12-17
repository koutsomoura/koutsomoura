import java.util.*;
import java.io.*;
public class ObjectofDomic {
	
	static int e=1;

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String names;
		String surnames;
		String numbers;
		for(int i=0;i<e;i++){
			
		System.out.print("Name: ");
		names=br.readLine();
		
		System.out.print("Surname: ");
		surnames=br.readLine();
		
		System.out.print("Number: ");		
		numbers=br.readLine();
		System.out.println("-------");
		
		Domic staff=new Domic(names,surnames,numbers);
		
		ArrayList <Domic> all=new ArrayList <Domic>();
		all.add(staff);
		
		
		for(Domic b:all){  
		        System.out.println(b.getName()+" "+b.getSurname()+" "+b.getNumber());  
				System.out.println("-------");

	    } 
	}
	
	}
}
