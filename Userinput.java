import java.io.*;
public class Userinput {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static int getInt(){
		int k=0;
		try{
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
			n=br.readLine();
			return n;
		}catch(IOException e){
		
		}
		return n;
	}
	public static String getName(){
	
		String o="";
		while(o.equals("")){
		o=getString();
		return o;
		}
		return o;
		
	}
	public static String getSurname(){
		
		String o="";
		while(o.equals("")){
		o=getString();
		return o;
		}
		return o;
	}
public static String getNumber(){
		
		String o="";
		while(o.equals("")){
		o=getString();
		return o;
		}
		return o;
	}
		
	
}
