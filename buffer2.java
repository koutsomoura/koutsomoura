import java.io.*;
public class buffer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.print("Parakalw eisagetai tin paraggeleia sas: ");
		str=br.readLine();
		System.out.println("Epibebaiwsh paraggelias:");
		System.out.println(str);
	}

}
