import java.io.*;
public class Buffer8 {

	/**
	 * @param args			try cash?
	 * 
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dwse ena akeraio apo to 1-3: ");
		i=Integer.parseInt(br.readLine());
		
		switch(i){
		case 0:	
			System.out.println("O arithmos einai 0");
			break;
		case 1:
			System.out.println("O arithmos einai 1");
			break;
		case 2:
			System.out.println("O arithmos einai 2");
			break;
		case 3:
			System.out.println("O arithmos einai 3");
		default:
			System.out.println("Lathos eisodos");
		}
		
	}

}
