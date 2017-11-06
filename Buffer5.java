import java.io.*;
public class Buffer5 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		char xarakthras;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input characters,'q' to quit");
		do{
			xarakthras=(char)br.read();
			System.out.println(xarakthras);
		}while(xarakthras!='q');
		
	}

}
