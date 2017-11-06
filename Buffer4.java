import java.io.*;
public class Buffer4 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	int epilogi;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println();
	System.out.println();
	System.out.println("Menu epilogon");
	
	System.out.println("------------");
	System.out.println("Ergasia 1");
	System.out.println("Ergasia 2");
	System.out.println("Ergasia 3");
	System.out.println("Ergasia 4");
	System.out.println("Ergasia 5");
	System.out.println();
	System.out.println();

	System.out.print("Dwse tn epilogisou (1-5:) ");
	epilogi=Integer.parseInt(br.readLine());
	switch(epilogi){
	case 1:
		System.out.println("e1");
		break;
	case 2:
		System.out.println("e2");
		break;
	case 3:
		System.out.println("e3");
		break;
	case 4:
		System.out.println("e4");
		break;
	case 5:
		System.out.println("e5");
		break;
	default:
		System.out.println("Lathos epilogi");
		break;
	}
	
	}

}
