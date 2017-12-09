import java.io.*;
public class Methodcase {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dialexte mia epilogi apo tis 1-5; ");
		
		int ok=0 ;

		try{
		
		ok=Integer.parseInt(br.readLine());
		
		}
		catch(NumberFormatException e){
			
			System.out.println("Parakalw eisagetai mia kathgoria apo 1 mexri 5");
			ok=Integer.parseInt(br.readLine());
			
		}
		switch(ok){
		case 1:
			System.out.println("Diale3ate thn kathgoria 1");
			break;
		
		case 2:
			System.out.println("Diale3ate thn kathgoria 2");
			break;
		case 3:	
			System.out.println("Diale3ate thn kathgoria 3");
			break;
		case 4:
			System.out.println("Diale3ate thn kathgoria 4");
			break;
		case 5:
			System.out.println("Diale3ate thn kathgoria 5");
			break;
			
		}
	}
	

}
