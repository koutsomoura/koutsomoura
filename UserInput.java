import java.io.*;
public class UserInput {
	
	

	public static String getString()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		return name;
	} 
	public static double getInteger(){
		int meresergasias=Integer.parseInt(br.readLine());
		double hmeromosthio=Double.parseDouble(br.readLine());
		double yperories=Double.parseDouble(br.readLine());
		
		return meresergasias,hmeromosthio,yperories;
	}
	
}
