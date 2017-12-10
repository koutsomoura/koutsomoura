import java.io.*;
public class Userinput {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static int getInt(){
		int k=0;
		try{
			System.out.println("Please input Stringline :");
			String n=br.readLine();
			k=Integer.parseInt(n);
			return k;
		}catch(IOException e){
		
		}
		return k;
	}
	public static String getString(){
		String n="";
		try{	
			System.out.println("Please input Stringline :");
			n=br.readLine();
			return n;
		}catch(IOException e){
		
		}
		return n;
	}
}
