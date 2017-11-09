import java.io.*;
public class Buffer7 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String choose;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Eisagetai grammes keimenoy" );
		System.out.println("Pliktrologise TELOS- gia telos keimenoy");
		do{
		choose=br.readLine();
		System.out.println(choose);
			
		}while (!choose.equals("TELOS"));

	}

}
