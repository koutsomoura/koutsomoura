import java.io.*;
import java.util.*;
public class askisi10 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList <String> myArr=new ArrayList<String>();
		myArr.add("Mykonos");
		myArr.add("Paros");
		myArr.add("Najos");
		myArr.add("Thessaloninki");
		myArr.add("Athina");
		myArr.add("Edessa");
		myArr.add("Xios");
		myArr.add("Mitilini");
		myArr.add("Florina");
		myArr.add("Kiklis");
		myArr.add("Larisa");
		
		System.out.println("Tyhaia epilogi diakopon");
		System.out.println("Dose to onoma sou");
		String name=br.readLine();
		
		Integer nameLength=name.length();
		if (nameLength==0){
			System.out.println("Den edwses onoma");
			return;
		}
		
		Integer vacationIndex=nameLength%myArr.size();
	
		System.out.println("\nTo onoma sou einai"+name+", me plithos xaraktion "+nameLength+"\n"+"gia auto sou proteino na pas "+myArr.get(vacationIndex));
	}

}
