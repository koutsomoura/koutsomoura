import java.io.*;
public class UserInput {
	
	

	public String getString()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int name=br.readLine();
		return name;
	} 
	
	
}
