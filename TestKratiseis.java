import java.io.*;
public class TestKratiseis{
public static void main(String[] args)throws IOException {
	double akatharistos,katharos;
	int kratiseis;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	
	System.out.print("Eisagetai ton akatharisto mistho: ");
	akatharistos=Double.parseDouble(br.readLine());
	
	
	
	System.out.print("Eisagetai to pososto kratiseon: ");
	kratiseis=Integer.parseInt(br.readLine());

	katharos=Kratiseis.YpologismosKratiseon( akatharistos, kratiseis);
	System.out.print("O katharos misthos einai: "+katharos);
	





}
}