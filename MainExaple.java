import java.io.*;
public class MainExaple {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		MethodExaple[] p=new MethodExaple[2];

		
		for (int i=0;i<p.length;i++){
			
			try{
			System.out.print("Name : ");
			String name=br.readLine();
			}catch(IOException e){
				
			}
			
			System.out.print("Code : ");
			int code=Integer.parseInt(br.readLine());
			
			System.out.print("Misthos : ");
			double misthos=Double.parseDouble(br.readLine());
			
			p[i]=new MethodExaple(name,code,misthos);
			p[i].toString();
			System.out.println("-----");
			
		}
		for (int i=0;i<p.length;i++){
			System.out.println(p[i]);
		}
		
	}

}
