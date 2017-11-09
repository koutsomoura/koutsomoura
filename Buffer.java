import java.io.*;

public class Buffer{
	public static void main(String args[]) throws IOException   {
		int c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Pliktrologise ena haractira  ");
		c= (int)br.read();

		System.out.println();
		System.out.println("O xaraktiras einai o :"+c);
}
}