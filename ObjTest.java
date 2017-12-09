import java.io.*;
public class ObjTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Test o=new Test();
		System.out.println("Eisagetai ton akatharisto mistho: ");
		o.akm=Double.parseDouble(br.readLine());
		System.out.println("Eisagetai ton sintelisti kratisewn");
		o.sintelestis=Integer.parseInt(br.readLine());
		System.out.println("\n");
		double cost;
		cost=o.Methodkm(o.akm, o.sintelestis);
		System.out.println(cost);
	
	}

}
