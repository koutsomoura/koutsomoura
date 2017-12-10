import java.io.*;
public class Userinput {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static int getInt()throws IOException{
		try{
			System.out.println("Please input Stringline :");
			String n=br.readLine();
			int k=Integer.parseInt(n);
			return k;
		}catch(IOException e){
		
		}
	}
	public static String getString()throws IOException{
		try{	
			System.out.println("Please input Stringline :");
			String n=br.readLine();
			return n;
		}catch(IOException e){
		
		}
	}
}
