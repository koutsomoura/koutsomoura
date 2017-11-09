import java.io.*;
public class UserInput {
	
	

	public static String getString()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String g=br.readLine();
		return g;
	} 
	public static int getInteger()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int y=Integer.parseInt(br.readLine());
		return y;
	}
	public static double getDouble()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double x=Double.parseDouble(br.readLine());		
		return x;
	}
	
}
