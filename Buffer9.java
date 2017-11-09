import java.io.*;
public class Buffer9 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int N,sumall,sumzigous,summonous;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dwse ena synolo arithmon");
		N=Integer.parseInt(br.readLine());
		inputData=userin.readLine(inputData);
		
		int count=0;
		while (count<=N){
			sumall=sumall+count;
		if (count/2==0)
			sumzigous=sumzigous+count;
		else
			summonous=summonous+count;
		
		count=count+1;
		}
		
		
		
	}

}
