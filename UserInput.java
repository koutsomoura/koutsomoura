import java.io.*;
public class UserInput {
	
	

	public static String getString()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		return name;
	} 
	public static int getInteger(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int meresergasias=Integer.parseInt(br.readLine());
		return meresergasias;
	}
	public static double getDouble{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double hmeromosthio=Double.parseDouble(br.readLine());		
		return hmeromosthio;
	}
	
}
