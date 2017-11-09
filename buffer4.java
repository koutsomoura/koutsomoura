import java.io.*;
public class buffer4 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int a;
		float b;
		double c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("O aritmos :");
		a=Integer.parseInt(br.readLine());
		System.out.println(" :");
		b=Float.parseFloat(br.readLine());
		System.out.println("O dekadikos :");
		c=Double.parseDouble(br.readLine());
		System.out.println("To athroisma tous einai "+(a+b+c));
	
	}

}
