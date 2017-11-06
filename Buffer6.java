import java.io.*;
public class Buffer6 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choose;
		String str;
		System.out.print("Put numbers: ");
		
		do{
			
			choose=Integer.parseInt(br.readLine());

			
			switch(choose){
			case 1:
				System.out.println("Epilogi 1");
				break;
			case 2:
				System.out.println("Epilogi 2");
				break;
			case 3:
				System.out.println("Epilogi 3");
				break;
			case 4:
				System.out.println("Epilogi 4");
				break;
			case 5:
				System.out.println("Epilogi 5");
				break;
			}
			
		}while (choose<1||choose>5);
	System.out.println("TELOS");
	}

}
