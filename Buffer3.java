import java.io.*;
public class Buffer3 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number a:");
		a=Integer.parseInt(br.readLine());
		System.out.println("Input number b:");
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println(c);
	}

}
